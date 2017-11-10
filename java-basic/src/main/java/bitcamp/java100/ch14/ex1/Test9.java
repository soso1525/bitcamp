package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.sql.Date;

/* 하위 폴더까지 출력하기 */

public class Test9 {
    public static void main(String[] args) throws Exception {
        File file = new File(".");
        printFiles(file);
    }

    // 디렉토리를 넘겨주면 그 안에 있는 내용물 출력
    static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();

        for (File f : files) {
            System.out.println(f.getCanonicalPath());

            if (f.isDirectory()) {
                printFiles(f);
            }
        }
    }
}
