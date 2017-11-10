package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Test5_2 {

    static class MyFileNameFilter implements FilenameFilter { // main 메소드에서 사용할 수 있도록 static 붙이기

        @Override
        public boolean accept(File dir, String name) {
            if (name.startsWith("."))
                return false;
            return true;
        }
    }

    public static void main(String[] args) {

        File file = new File(".");

        // 특정 조건에 부합하는 이름만 꺼내고 싶을 때 - Filter

        String[] filenames = file.list(new MyFileNameFilter());
        for (String name : filenames)
            System.out.println(name);

    }
}
