package bitcamp.java100.Test21_5;

import java.io.Console;

public class Test21_5_5 {

    // 클래스 변수
    // => 클래스를 실행하기 위해 HDD에서 메모리로 로딩할 때 생성되는 변수이다.
    // => new 명령으로 생성되는 변수가 아니다.
    static Console console;

    static void prepareInput() {
        console = System.console();

        if (console == null) {
            // 예외 상황을 만나면 호출자에게 알린다.
            throw new RuntimeException("콘솔 생성 오류!");
        }
    }

    static int promptGugudan() {
        int i = Integer.parseInt(console.readLine("구구단? "));

        if (i >= 10 || i == 1 || i < 0) {
            // 예외 상황을 만나면 호출자에게 알린다.
            throw new RuntimeException("구구단의 범위를 초과했습니다.");
        }

        return i;
    }

    static void printGugudan(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
    }

    public static void main(String[] args) {
        // 메서드를 실행하다가 예외 상황을 보고하면 처리한다.
        try {
            prepareInput();
        } catch (RuntimeException e) {
            System.err.println("콘솔 입력을 지원하지 않습니다.");
            System.exit(1);
        }

        while (true) {
            int i = 0;
            try {
                i = promptGugudan();
                if (i == 0)
                    break;
                printGugudan(i);
            } catch (RuntimeException e) {
                System.err.println("구구단의 범위가 아닙니다.");
            }
        }

        System.out.println("다시 또 오세요!");
    }
}