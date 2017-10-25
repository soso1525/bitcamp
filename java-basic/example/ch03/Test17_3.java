package bitcamp.java100;

public class Test17_3 {
    static void m1(String name) {
        System.out.printf("%s님 반갑습니다!\n", name);
    }

    static void m2(String name) {
        System.out.printf("%s님 반갑습니다!\n", name);
    }

    public static void main(String[] args) {

        m1("홍길동");
        m1("임꺽정");
        m1("유관순");

        m2("홍길동");
        m2("임꺽정");
        m2("유관순");
    }
}
