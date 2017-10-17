package bitcamp.java100;

/* Class Method vs Instance Method */

public class Test17_18 {
    static class My {
        int value;

        static void print(My ref) {
            System.out.println(ref.value);
        }
    } //class 메소드는 this라는 reference 변수 없음 (객체를 생성할 수 없기 때문)

    public static void main(String[] args) {

        My r1 = new My();
        My r2 = new My();
        My r3 = new My();

        r1.value = 100; // 인스턴스 r1의 변수 value를 field라고 함
        r2.value = 200;
        r3.value = 300;

        My.print(r1);
        My.print(r2);
        My.print(r3);

    }
}
