package bitcamp.java100;

import java.io.Console;

public class Test21_5 {
    public static void main(String[] args) {

        Console c = System.console();
        System.out.println("구구단을 시작합니다.");
        System.out.println("프로그램을 종료하고싶으면 0을 입력하세요.");

        while (true) {
            int dan = Integer.valueOf(c.readLine("\n몇 단? "));
            if (dan == 0) {
                System.out.println("0을 입력하셨네요. 프로그램을 종료합니다.");
                System.out.println("다음에 또 봐요!");
                System.exit(0);
            }

            if (dan < 2 || dan > 9) {
                System.out.println("2에서 9단까지만 가능합니다.");
                System.out.println("다시 입력해주세요.");
                System.out.println();
                continue;
            }
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + " x " + i + " = " + dan * i);
            }
        }
    }
}