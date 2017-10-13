package bitcamp.java100;

public class Test17_2 {
    static void m1() {
        System.out.println("m1() 메소드 실행됨!");
    }

    static void m2(String name) {
        System.out.printf("%s님 반갑습니다!\n", name);
    }

    public static void main(String[] args) {
        m2("홍길동");
        m2("임꺽정");
        m2("유관순");
    }
}
