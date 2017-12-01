package java100.app.control;

import java.io.PrintWriter;
import java.util.Scanner;

import java100.app.dao.mysql.RoomDaoImpl;

public class HelloController implements Controller {
    Scanner keyScan = new Scanner(System.in);
    RoomDaoImpl roomDaoImpl;

    public void setRoomDao(RoomDaoImpl roomDaoImpl) {
        this.roomDaoImpl = roomDaoImpl;
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init() {
    }

    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/hello/hi":
            this.doHi(request, response);
            break;
        case "/hello/hi2":
            this.doHi2(request, response);
            break;
        default:
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doHi(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("하이루");
    }

    private void doHi2(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("오호라");
    }
}
