package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("보낼 메시지: ");
        String msg = sc.nextLine();

        System.out.print("서버 주소: ");
        String serverAddr = sc.nextLine();

        Socket socket = new Socket(serverAddr, 9999);
        System.out.println("서버와 연결되었다.");

        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(msg);

        Scanner in = new Scanner(socket.getInputStream());
        System.out.println(in.nextLine());

        in.close();
        out.close();
        socket.close();
        System.out.println("클라이언트를 종료하였다!");
    }
}
