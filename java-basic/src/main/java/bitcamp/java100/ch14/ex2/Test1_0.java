package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_0 {
    public static void main(String[] args) throws Exception {
        File file = new File("sample/a.jpg");
        FileInputStream in = new FileInputStream(file);

        int size = 0;
        int c = 0;
        while (c != -1) {
            c = in.read();
            System.out.println(Integer.toHexString(c));

            size += 1;
        }

        System.out.println(size);
        in.close();
    }
}
