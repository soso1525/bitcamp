package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Test5_4 {
    public static void main(String[] args) {

        FilenameFilter filter = new FilenameFilter() { // 익명클래스라서 앞에 붙는 키워드 전부 필요 X -> but 바로 생성
            @Override
            public boolean accept(File dir, String name) {
                if (name.startsWith("."))
                    return true;
                return false;

            }
        }; // 메소드 안에 들어간 클래스 >> 로컬클래스

        File file = new File(".");

        // 특정 조건에 부합하는 이름만 꺼내고 싶을 때 - Filter

        String[] filenames = file.list(filter);
        for (String name : filenames)
            System.out.println(name);

    }
}
