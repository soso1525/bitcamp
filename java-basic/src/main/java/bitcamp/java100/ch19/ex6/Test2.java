package bitcamp.java100.ch19.ex6;

public class Test2 {
    public static void main(String[] args) {
        MyAnnotation2 anno = MyClass2.class.getAnnotation(MyAnnotation2.class);

        for (String s : anno.name())
            System.out.println(s);
        System.out.println("--------");
        for (int n : anno.age())
            System.out.println(n);

    }
}
