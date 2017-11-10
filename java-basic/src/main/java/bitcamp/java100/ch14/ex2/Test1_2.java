package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("sample/jls9.pdf");
        // buffer >> 데이터를 읽을 때 바이트 배열에 왕창 읽어올 수 있다.
        // byte[] buf = new byte[1024];

        // int len = 0;
        int count = 0;

        long start = System.currentTimeMillis();
        // while ((len = in.read(buf)) != -1) {
        // count += len;
        // }

        int b = 0;
        while ((b = in.read()) != -1) {
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("읽은 바이트 수: " + count);
        System.out.println("걸린시간: " + (end - start) / 1000);
        in.close();
    }
}
