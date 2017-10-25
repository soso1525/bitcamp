package bitcamp.java100.test21_8;

import java.io.Console;

public class Test21_8_eom {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("console을 지원하지 않습니다");
            System.exit(1);
        }

        String[] names = new String[3];
        String[] emails = new String[3];
        String[] tels = new String[3];

        int cursor = 0;

        while (cursor < names.length) {
            System.out.println();
            names[cursor] = console.readLine("이름?: ");
            emails[cursor] = console.readLine("이메일? ");
            tels[cursor] = console.readLine("전화? ");
            cursor++;
        }

        cursor = 0;

        while (cursor < names.length) {
            System.out.println();
            System.out.println(names[cursor]);
            System.out.println(emails[cursor]);
            System.out.println(tels[cursor]);
            cursor++;
        }

    }
}
