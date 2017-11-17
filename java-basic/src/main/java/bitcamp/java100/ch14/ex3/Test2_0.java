package bitcamp.java100.ch14.ex3;

import java.io.FileInputStream;

public class Test2_0 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("test1.dat");
        // 한글 3byte
        int len = in.read();
        byte[] bytes = new byte[len];

        in.read(bytes);

        Score s = new Score();
        s.setName(new String(bytes, "UTF-8"));
        s.setKor(in.read());
        s.setEng(in.read());
        s.setMath(in.read());

        in.close();

        System.out.println(s);
    }
}
