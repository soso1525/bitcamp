package bitcamp.java100;

public class Test17_4 {
    static void m1(int... values) { // 가변길이 파라미터
        System.out.printf("아규먼트 개수: %d\n", values.length);
        for (int v : values)
            System.out.print(v + " ");
        System.out.println();
        System.out.println();
    }

    static void sum(int... values) {
        int s = 0;
        for (int v : values) {
            s += v;
        }
        System.out.printf("합계: %d\n", s);
    }

    public static void main(String[] args) {
        m1();
        m1(10);
        m1(3, 24);
        m1(2, 5, 6);

        sum();
        sum(1, 2, 3, 4, 5);
        sum(100, 80, 70, 90);

    }

}
