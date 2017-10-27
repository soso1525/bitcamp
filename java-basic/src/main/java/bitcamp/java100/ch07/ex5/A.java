package bitcamp.java100.ch07.ex5;

public class A {
    /*
     * A() { super(); //Object의 생성자 }
     */

    A() {
        System.out.println("A() 생성자 실행");
    }

    A(String str) {
        super();
        System.out.println("A(String) 호출됨");
    }

    A(int i) {
        System.out.println("A(int) 호출됨");
    }
}
