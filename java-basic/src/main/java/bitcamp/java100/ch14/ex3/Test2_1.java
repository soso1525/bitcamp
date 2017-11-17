package bitcamp.java100.ch14.ex3;

import java.io.FileInputStream;

public class Test2_1 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("test1.dat");
        // 한글 3byte
        int len = in.read();
        byte[] bytes = new byte[len];

        in.read(bytes);

        Score s = new Score();
        s.setName(new String(bytes, "UTF-8"));

        int temp = (in.read() << 24) | (in.read() << 16) | (in.read() << 8) | in.read();
        s.setKor(temp);
        temp = (in.read() << 24) | (in.read() << 16) | (in.read() << 8) | in.read();
        s.setEng(temp);
        temp = (in.read() << 24) | (in.read() << 16) | (in.read() << 8) | in.read();
        s.setMath(temp);

        in.close();

        System.out.println(s);
    }
}
