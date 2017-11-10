package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.Date;

public class Test6 {
    public static void main(String[] args) {
        File file = new File(".");
        // 특정 조건에 부합하는 이름만 꺼내고 싶을 때 - Filter

        File[] files = file.listFiles(new FilenameFilter() { // 익명클래스라서 앞에 붙는 키워드 전부 필요 X -> but 바로 생성
            @Override
            public boolean accept(File dir, String name) {
                
                //new File(dir, name).getName() 이런식
                
                if (name.startsWith("."))
                    return false;
                return true;

            }
        });
        
        for (File f : files) {
            // 파일인지 디렉토리인지 , 파일 사이즈 , 파일 날짜 , 파일명
            System.out.printf("%3s\t%d\t%s\t%s\n", f.isDirectory() ? "d" : "-", f.length(),
                    new Date(f.lastModified()).toString(), f.getName());
        }

    }
}
