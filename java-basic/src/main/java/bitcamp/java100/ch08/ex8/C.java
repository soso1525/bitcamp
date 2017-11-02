package bitcamp.java100.ch08.ex8;

public class C extends A {
    // int m1(int a) {
    // System.out.println("int m1(int)");
    // } // 호출할 때 구별할 수가 없음. 메소드는 파라미터의 타입, 개수, 순서로 구별하기 때문에

    static int plus(int a, int b) {
        return a + b;
    }

    // static int plus(int v1, int v2) {
    // return v1 + v2 + v2;
    // }

    static void m1(int a, String b) {
        System.out.println("m1(int, String)");
    }

    static void m1(String a, int b) {
        System.out.println("m1(String, int)");
    }

    public static void main(String[] args) {
        System.out.println(plus(10, 20));
        m1(10, "aaa");
        m1("aaa", 10);
    }

}
