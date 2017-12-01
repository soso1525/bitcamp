package bitcamp.java100.ch19.ex5;

public class Test1 {
    public static void main(String[] args) {
        MyAnnotation1 anno = MyClass1.class.getAnnotation(MyAnnotation1.class);

        for (String s : anno.name())
            System.out.println(s);
        System.out.println("--------");
        for (int n : anno.age())
            System.out.println(n);

    }
}
