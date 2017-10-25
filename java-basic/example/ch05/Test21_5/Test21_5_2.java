package bitcamp.java100.Test21_5;

import java.io.Console;

// 2단계: 종료 조건은 if ~ else로, 주 작업은 기본 블록에서 한다.
//        즉 들여쓰기를 최소화 한다.
public class Test21_5_2 {

    public static void main(String[] args) {
        // 콘솔 객체를 준비한다.
        Console console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }

        int i, j;

        i = Integer.parseInt(console.readLine("구구단? => "));

        if (i >= 10 || i == 1) {
            System.out.println("2에서 9단까지만 가능합니다!");
            return;

        } else if (i == 0) {
            System.out.println("다음에 또 봐요!");
            return;

        }

        for (j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
    }
}