package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버를 실행하였다!");

        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었다!");

        Scanner in = new Scanner(socket.getInputStream());
        String line = in.nextLine();
        System.out.println(line);

        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(line);
        // 클라이언트가 완전히 읽기전까지 리턴하지 않음

        in.close();
        out.close();
        socket.close();
        ss.close();
        System.out.println("서버를 종료하였다!");
    }
}
