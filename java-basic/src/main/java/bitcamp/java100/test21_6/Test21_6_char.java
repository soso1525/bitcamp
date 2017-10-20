package bitcamp.java100.test21_6;

import java.io.Console;

//입력받은 숫자 개수 세기

public class Test21_6_char {
    static Console c;
    static int[] cnt = new int[10];

    static void initConsole() {
        c = System.console();
        if (c == null) {
            System.err.println("콘솔이 지원되지 않습니다");
            System.exit(1);
        }
    }

    static String inputNumber() {
        return (c.readLine("숫자를 입력하세요: "));
    }

    static void count(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt[c - '0']++;
        }
    }

    static void printNum() {
        System.out.println("===== 입력된 숫자의 개수 출력 =====");
        for (int i = 0; i < cnt.length; i++) {
            System.out.println(i + " - " + cnt[i]);
        }
    }

    public static void main(String[] args) {

        initConsole();
        String s = inputNumber();
        count(s);
        printNum();

    }
}
