package bitcamp.java100.ch15.ex1;

import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        // localhost = "127.0.0.1";
        // Socket socket = new Socket("127.0.0.1", 9999);
        Socket socket = new Socket("192.168.0.51", 9999);
        System.out.println("서버와 연결되었다.");

        System.out.println("클라이언트 IP = " + socket.getLocalAddress().getHostAddress());
        System.out.println("클라이언트 PORT = " + socket.getLocalPort());
        System.out.println("서버 IP = " + socket.getInetAddress().getHostAddress());
        System.out.println("서버 PORT = " + socket.getPort());

        socket.close();
        System.out.println("클라이언트를 종료하였다!");
    }
}
