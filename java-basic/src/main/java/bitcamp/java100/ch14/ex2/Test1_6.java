package bitcamp.java100.ch14.ex2;

import java.io.FileInputStream;

public class Test1_6 {
    public static void main(String[] args) throws Exception {
        // FileInputStream in = new FileInputStream("./sample/jls9.pdf");
        // BufferedInputStream in2 = new BufferedInputStream(in);
        MyBufferedInputStream2 in2 = new MyBufferedInputStream2(new FileInputStream("./sample/jls9.pdf"));
        int count = 0;

        long start = System.currentTimeMillis();
        int b = 0;
        while ((b = in2.read()) != -1) {
            System.out.print(b);
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("읽은 바이트 수: " + count);
        System.out.println("걸린시간: " + (end - start));
        // in2.close();
    }
}
