package bitcamp.java100.ch15.ex2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(9999, 3); // 3은 대기열 개수로 백로그라 한다
        System.out.println("서버를 실행하였다!");

        for (int i = 0; i < 10; i++) {
            System.out.println("다음 클라이언트: ");
            sc.nextLine();
            
            Socket socket = ss.accept(); // 대기하고 있는 클라이언트 중 먼저 온 애부터 처리
            System.out.println("클라이언트와 연결되었음");
            System.out.println(socket.getInetAddress().getHostAddress() + " : " + socket.getPort());

            socket.close();
        }

        ss.close();
        System.out.println("서버를 종료하였다!");
    }
}
