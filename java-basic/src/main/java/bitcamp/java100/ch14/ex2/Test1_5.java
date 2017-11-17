package bitcamp.java100.ch14.ex2;

import java.io.FileInputStream;

public class Test1_5 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("./sample/jls9.pdf");
        MyBufferedInputStream2 in2 = new MyBufferedInputStream2(in);
        // MyBufferedInputStream2 in2 = new MyBufferedInputStream2(new
        // FileInputStream("./sample/jls9.pdf"));
        int count = 0;

        long start = System.currentTimeMillis();
        int b = 0;
        while ((b = in2.read()) != -1) {
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("읽은 바이트 수: " + count);
        System.out.println("걸린시간: " + (end - start));
        in.close();
    }
}
