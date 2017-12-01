package bitcamp.java100.ch18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Test3 {
    public static void main(String[] args) throws Exception {

        // Class<?> clazz = String.class;
        // Class<?> clazz = java.util.Calendar.class;
        Class<?> clazz = Z.class;
        Constructor<?>[] constructors = clazz.getConstructors();

        for (Constructor con : constructors) {
            System.out.println(con.getName());
            Parameter[] params = con.getParameters();
            for (Parameter param : params) {
                System.out.printf("==> %s", param.getName());
                System.out.printf(" - %s\n", param.getType().getName());
            }
            System.out.println();
        }

        System.out.println("=======================================");

        constructors = clazz.getDeclaredConstructors();

        for (Constructor con : constructors) {
            System.out.println(con.getName());
            Parameter[] params = con.getParameters();
            for (Parameter param : params) {
                System.out.printf("==> %s", param.getName());
                System.out.printf(" - %s\n", param.getType().getName());
            }
            System.out.println();
        }
    }
}
