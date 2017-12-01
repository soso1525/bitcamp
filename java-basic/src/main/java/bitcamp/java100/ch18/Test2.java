package bitcamp.java100.ch18;

import java.io.StringWriter;

public class Test2 {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = StringWriter.class;
        System.out.println("getName()\t" + clazz.getName());
        System.out.println("getSimpleName()\t" + clazz.getSimpleName());
        System.out.println("getTypeName()\t" + clazz.getTypeName());
        
        Class<?> superClass = clazz.getSuperclass();
        System.out.println("getSuperClass()\t" + superClass.getName());
    }
}
