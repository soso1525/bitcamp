package bitcamp.java100.ch18;

import java.io.StringWriter;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //클래스 로딩 후 정보 얻어옴
        Class<?> c1 = Class.forName("java.io.BufferedReader");
        //하드코딩
        Class<?> c2 = java.io.BufferedWriter.class;

        StringWriter in = new StringWriter();
        Class<?> c3 = in.getClass();
        
        
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        
        System.out.println();
        System.out.println(c1.getSimpleName());
        System.out.println(c2.getSimpleName());
        System.out.println(c3.getSimpleName());
    }
}
