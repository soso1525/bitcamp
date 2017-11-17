package bitcamp.java100.ch15.taboo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        byte[] buf = new byte[8192];
        Socket socket = new Socket(ConnectionInfo.ip, ConnectionInfo.port);
        File f = new File("Taboo.mkv");
        System.out.println(f.length());

        BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));

        long start = System.currentTimeMillis();
        out.writeUTF(f.getName());
        out.writeLong(f.length());
        for (long i = 0; i < f.length() / buf.length + 1; i++) {
            if (in.read(buf, 0, buf.length) != -1)
                out.write(buf);
        }
        out.flush();
        long end = System.currentTimeMillis();

        System.out.println("파일 전송 완료!");
        System.out.println("전송에 걸리는 시간: " + (end - start));
    }
}
