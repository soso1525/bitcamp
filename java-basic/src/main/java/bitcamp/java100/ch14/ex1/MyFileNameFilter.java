package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileNameFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        // 이 메서드는 list() / listFiles()에서 호출된다

        // 디렉토리만 리턴
        // 파일 객체를 만들어주어야 함..... 왜? 
        File file = new File(dir, name);
        
        if (file.isDirectory())
            return true;

        return false;
    }

}
