package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

/* File System 다루기 - File 클래스 */

public class Test1 {
    public static void main(String[] args) throws IOException {
        // File file = new File(".");
        // File file = new File("../../");
        File file = new File("../java-project/build.gradle");
        System.out.printf("파일명 = %s\n", file.getName());

        System.out.println("부모 디렉토리 = " + file.getPath());
        System.out.println("절대 경로 = " + file.getAbsolutePath());

        System.out.println("계산된 경로 = " + file.getCanonicalPath()); // .에 대한 상대 경로를 계산해서 절대경로로 보여줌
        // file 객체를 생성할 때 생성자에 넘겨준 기준 디렉토리 리턴
        System.out.println("기준 디렉토리 = " + file.getParent());

        System.out.println("전체 용량 = " + file.getTotalSpace());
        System.out.println("사용 가능 용량 = " + file.getUsableSpace());
        System.out.println("남은 용량 = " + file.getFreeSpace());

        System.out.println("파일 존재 여부 = " + file.exists());
        System.out.println("파일 여부 = " + file.isFile());
        System.out.println("디렉토리 여부 = " + file.isDirectory());

        System.out.println(file.length());

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());

        System.out.println(file.lastModified()); // 1000분의 1초
        System.out.println(new Date(file.lastModified()).toString());
        
        System.out.println();
    }
}
