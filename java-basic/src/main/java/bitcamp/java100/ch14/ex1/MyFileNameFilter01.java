package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileNameFilter01 implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        // 이 메서드는 list() / listFiles()에서 호출된다

        try {
            System.out.println(dir.getCanonicalPath() + ", " + name);
        } catch (Exception e) {

        }

        return true;
    }

}
