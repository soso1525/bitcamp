package bitcamp.java100;

/* Class Method vs Instance Method */

public class Test17_19 {
    static class My {
        int value;

        void print() { // instance method
            System.out.println(this.value);
        }
    }

    // 실행중에 발생하는 오류 - runtime exception

    public static void main(String[] args) {

        My r1 = new My();
        My r2 = new My();
        My r3 = new My();

        My r4 = null;
        r4.print();

        r1.value = 100; // 인스턴스 r1의 변수 value를 field라고 함
        r2.value = 200;
        r3.value = 300;

        r1.print();
        r2.print();
        r3.print();

        String s1 = "hello";
//        s1.print();
    }
}
