package bitcamp.java100.ch07.ex5;

public class C extends A {
    C(String msg) {
        // super("hello");
        super(100);
        System.out.println("C(String) 생성자 실행 - " + msg);
    }
}
