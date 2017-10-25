package bitcamp.java100.ch06.ex3;

public class Test7 {

    static class A {
        static int a = 100; // 2. static field 생성 및 할당
        static { //3. static block이 있으면 블록 내부 내용 차례대로 실행
            System.out.println("A의 static 블록 실행");
            System.out.printf("A ==> a = %d\n", A.a);
            B.b = 222;
            System.out.printf("A ==> a = %d\n", A.a);
            System.out.println("A의 static 블록 종료");
        }
    }

    static class B {
        static int b = 200;
        static {
            System.out.println("B의 static 블록 실행");
            System.out.printf("B ==> b = %d\n", B.b);
            A.a = 111;
            System.out.printf("B ==> b = %d\n", B.b);
            System.out.println("B의 static 블록 종료");
        }
    }

    public static void main(String[] args) {
        new A(); // 1. A.class loading
    }
}
