package bitcamp.java100.ch18;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test5 {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Z.class;
        Method m = clazz.getDeclaredMethod("m3", int.class, float.class);
        System.out.println("Method Name: " + m.getName());
        System.out.println("Return Type: " + m.getReturnType());

        int modifiers = m.getModifiers(); // 비트연산들어감 - 32bit >> 32개 옵션

        // if ((modifiers & Modifier.PUBLIC) == Modifier.PUBLIC)
        if (Modifier.isPublic(modifiers))
            System.out.println("public");

        // if ((modifiers & Modifier.PRIVATE) == Modifier.PRIVATE)
        else if (Modifier.isPrivate(modifiers))
            System.out.println("private");

        // if ((modifiers & Modifier.PROTECTED) == Modifier.PROTECTED)
        else if (Modifier.isProtected(modifiers))
            System.out.println("protected");
        
        else System.out.println("default");
        
        System.out.println(Modifier.toString(modifiers));
    }
}
