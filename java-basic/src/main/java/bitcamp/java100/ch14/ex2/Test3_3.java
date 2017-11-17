package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_3 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream(new File("sample/jls9.pdf"));
        BufferedInputStream in2 = new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream(new File("sample/jls9-4.pdf"));
        BufferedOutputStream out2 = new BufferedOutputStream(out);

        // 이렇게 적어도 내부적으로는 버퍼를 사용하여 데이터 입출력
        int b;
        int len = 0;
        long start = System.currentTimeMillis();
        while ((b = in2.read()) != -1) {
            out2.write(b);
        }
        out2.flush();
        long end = System.currentTimeMillis();

        System.out.println("걸린시간 = " + (end - start));

        out.close();
        in.close();

        System.out.println("파일 복사 완료");
    }
}
