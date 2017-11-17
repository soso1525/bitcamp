package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 9999);
        System.out.println("서버와 연결되었다.");

        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println("hello");

        Scanner in = new Scanner(socket.getInputStream());
        System.out.println(in.nextLine());

        in.close();
        out.close();
        socket.close();
        System.out.println("클라이언트를 종료하였다!");
    }
}
