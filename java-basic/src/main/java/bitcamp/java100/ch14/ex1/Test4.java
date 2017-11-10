package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.sql.Date;

public class Test4 {
    public static void main(String[] args) {
        File file = new File(".");

        File[] files = file.listFiles();
        for (File f : files) {

            // 파일인지 디렉토리인지 , 파일 사이즈 , 파일 날짜 , 파일명
            System.out.printf("%3s\t%d\t%s\t%s\n", f.isDirectory() ? "d" : "-", f.length(),
                    new Date(f.lastModified()).toString(), f.getName());
        }
    }
}
