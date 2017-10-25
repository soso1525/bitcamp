package bitcamp.java100.Test21_5;

//단 입력받아서 구구단 출력 - mine

import java.io.Console;

public class Test21_5_1 {
    static Console c;

    static void prepareInput() {
        c = System.console();

        if (c == null) {
            System.out.println("콘솔을 지원하지 않습니다");
            System.exit(1);
        }

        System.out.println("구구단을 시작합니다");
        System.out.println("종료하고 싶으면 0을 입력하세요");
    }

    static int promptGugudan() {

        return Integer.parseInt(c.readLine("\n몇 단? "));
    }

    static void printGugu(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }

    public static void main(String[] args) {

        prepareInput();

        while (true) {
            int dan = promptGugudan();
            if (dan == 0) {
                System.out.println("0을 입력하셨네요. 프로그램을 종료합니다.");
                System.out.println("다음에 또 봐요!");
                System.exit(0);
            } else if (dan < 2 || dan > 9) {
                System.out.println("2에서 9단까지만 가능합니다.");
                System.out.println("다시 입력해주세요.");
                System.out.println();
                continue;
            }

            printGugu(dan);
        }
    }
}