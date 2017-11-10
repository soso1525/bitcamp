package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.util.ArrayList;

public class Test11 {
    static ArrayList<File> fileList = new ArrayList<File>();

    public static void main(String[] args) throws Exception {
        File file = new File(".");
        fileList.add(file);
        while (fileList.size() > 0)
            printFiles(fileList.remove(0));
    }

    // 디렉토리를 넘겨주면 그 안에 있는 내용물 출력
    static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();

        for (File f : files) {

            if (f.getCanonicalPath().toString().endsWith(".class"))
                System.out.println(f.getCanonicalPath());

            // if (f.getName().endsWith(".class"))
            // System.out.println(f.getName());

            if (f.isDirectory()) {
                fileList.add(f);
            }
        }
    }
}
