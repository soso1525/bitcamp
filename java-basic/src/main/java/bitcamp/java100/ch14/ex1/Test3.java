package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File(".");

        // list() > file객체의 파일과 디렉토리 전부 출력
        for (String s : file.list())
            System.out.println(s);

    }
}
