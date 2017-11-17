package bitcamp.java100.ch14.ex3;

import java.io.FileOutputStream;

public class Test1_0 {
    public static void main(String[] args) throws Exception {
        Score s = new Score("홍길동", 800, 900, 1000);

        FileOutputStream out = new FileOutputStream("test1.dat");

        byte[] bytes = s.getName().getBytes("UTF-8");

        out.write(bytes.length); // 0x 00 00 00 09
        out.write(bytes);

        out.write(s.getKor());
        out.write(s.getEng());
        out.write(s.getMath());

        out.close();

        System.out.println("출력을 완료했습니다.");
    }
}
