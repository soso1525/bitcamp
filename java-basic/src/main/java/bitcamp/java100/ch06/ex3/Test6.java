package bitcamp.java100.ch06.ex3;

public class Test6 {
    class A {

    }

    static class B {

    }

    public static void main(String[] args) {

        // Reference 선언시에는 static 유무 상관없이 문제 없음
        A obj1;
        B obj2;

        //obj1 = new A(); 컴파일 오류
        obj1 = new Test6().new A();
        obj2 = new B();
    }
}
