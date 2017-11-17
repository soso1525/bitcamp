package bitcamp.java100.ch15.taboo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 시작!");
        ServerSocket ss = new ServerSocket(ConnectionInfo.port);
        Socket socket = ss.accept();
        System.out.println("클라이언트 접속!");

        byte[] buf = new byte[8192];
        DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        long start = System.currentTimeMillis();
        String name = in.readUTF();
        long size = in.readLong();
        System.out.println(name);
        System.out.println(size + "bytes");
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("./sample/xx_" + name));

        for (long i = 0; i < size / buf.length + 1; i++) {
            if (in.read(buf, 0, buf.length) != -1)
                out.write(buf);
        }
        out.flush();
        long end = System.currentTimeMillis();
        System.out.println("안녕!");
        System.out.println("걸린 시간: " + (end - start));
    }
}
