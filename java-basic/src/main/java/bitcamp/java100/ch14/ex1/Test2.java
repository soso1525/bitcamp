package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test2 {
    public static void main(String[] args) throws Exception {

        File file = new File("ok.txt");

        System.out.println(file.createNewFile());
        File file2 = new File("dir1");
        file2.mkdir();
        file2.delete();

        File file3 = new File("aaa/bbb/ccc/test.txt");
        file3.mkdirs();
    }
}
