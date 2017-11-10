package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test5_1 {
    public static void main(String[] args) {
        File file = new File(".");

        // 특정 조건에 부합하는 이름만 꺼내고 싶을 때 - Filter

        String[] filenames = file.list(new MyFileNameFilter());
        for (String name : filenames)
            System.out.println(name);

    }
}
