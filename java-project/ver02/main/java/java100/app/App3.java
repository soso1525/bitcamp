package java100.app;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import java100.app.control.BoardController;
import java100.app.control.Controller;
import java100.app.control.MemberController;
import java100.app.control.Request;
import java100.app.control.Response;
import java100.app.control.RoomController;
import java100.app.control.ScoreController;
import java100.app.dao.DaoException;

public class App3 {

    ServerSocket ss;
    Scanner keyScan = new Scanner(System.in);

    // 이제 HashMap에 보관하는 값은 Controller 규칙을 준수한 객체이다.
    HashMap<String, Controller> controllerMap = new HashMap<>();

    public static Connection con;

    void init() {

        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studydb", "study", "1111");
        } catch (Exception e) {
            throw new DaoException(e);
        }
        ScoreController scoreController = new ScoreController();
        scoreController.init();
        controllerMap.put("/score", scoreController);

        RoomController roomController = new RoomController();
        roomController.init();
        controllerMap.put("/room", roomController);

        MemberController memberController = new MemberController();
        memberController.init();
        controllerMap.put("/member", memberController);

        BoardController boardController = new BoardController();
        boardController.init();
        controllerMap.put("/board", boardController);

    }

    void service() throws Exception {
        // 서버 소켓 준비
        ss = new ServerSocket(9999);
        System.out.println("서버 실행!");

        while (true) {
            // 클라이언트가 연결되면, 스레드에 처리를 위임한다.
            new HttpAgent(ss.accept()).start();
        }
    }

    private void save() {
        Collection<Controller> controllers = controllerMap.values();
        for (Controller controller : controllers) {
            controller.destroy(); // List에 들어있는 값을 파일에 저장.
        }
    }

    private void request(String command, PrintWriter out) {

        String menuName = command;

        int i = command.indexOf("/", 1);
        if (i != -1) {
            menuName = command.substring(0, i);
        }

        Controller controller = controllerMap.get(menuName);

        if (controller == null) {
            out.println("해당 명령을 지원하지 않습니다.");
            return;
        }

        // Controller를 실행하기 전에 컨트롤러가 작업하기 편하게
        // 클라이언트가 보낸 명령을 분석하여 객체 담아 둔다.
        Request request = new Request(command);

        Response response = new Response();
        response.setWriter(out);

        controller.execute(request, response);
    }

    private void hello(String command, PrintWriter out) {
        out.println("안녕하세요. 성적관리 시스템입니다.");
        out.println("[성적관리 명령들]");
        out.println("목록보기: /score/list");
        out.println("상세보기: /score/view?name=이름");
        out.println("등록: /score/add?name=이름&kor=점수&eng=점수&math=점수");
        out.println("변경: /score/update?name=이름&kor=점수&eng=점수&math=점수");
        out.println("삭제: /score/delete?name=이름");
        out.println("[회원]");
        out.println("[게시판]");
        out.println("[강의실]");

    }

    public static void main(String[] args) throws Exception {
        App3 app = new App3();
        app.init();
        app.service();
    }

    class HttpAgent extends Thread {
        Socket socket;

        public HttpAgent(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (Socket socket = this.socket; // 왜? 자동 close() 호출!
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(new BufferedOutputStream(
                            socket.getOutputStream()));) {

                // Request-line >> GET /score/list HTTP/1.1 CRLF;
                String command = in.readLine().split(" ")[1];

                String header = null;
                while (true) {
                    header = in.readLine();
                    if (header.equals(""))
                        break;
                }

                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type:text/plain;charset=UTF-8");
                out.println();

                if (command.equals("/")) {
                    hello(command, out);
                } else {
                    request(command, out);

                    save();
                }
                out.println();
                out.flush();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
