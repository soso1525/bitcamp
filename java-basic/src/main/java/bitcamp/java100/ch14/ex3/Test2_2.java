package bitcamp.java100.ch14.ex3;

import java.io.FileInputStream;

public class Test2_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("test2.dat");
        MyDataInputStream in2 = new MyDataInputStream(in);
        Score s = new Score();
        s.setName(in2.readUTF());
        s.setKor(in2.readInt());
        s.setEng(in2.readInt());
        s.setMath(in2.readInt());
        in.close();
        System.out.println(s);
    }
}
