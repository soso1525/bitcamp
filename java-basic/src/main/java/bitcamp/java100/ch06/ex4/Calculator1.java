package bitcamp.java100.ch06.ex4;

public class Calculator1 {
    static int result;

    static void plus(int value) {
        result += value; // compiler가 클래스 변수앞에 클래스명을 알아서 붙여준다
    }

    static void minus(int value) {
        result -= value;
    }

    static void multiple(int value) {
        result *= value;
    }

    static void divide(int value) {
        result /= value;
    }
}
