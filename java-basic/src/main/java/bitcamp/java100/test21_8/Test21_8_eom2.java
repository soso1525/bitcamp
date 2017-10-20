package bitcamp.java100.test21_8;

import java.io.Console;

public class Test21_8_eom2 {
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
            String name = console.readLine("이름?: ");
            String email = console.readLine("이메일? ");
            String tel = console.readLine("전화? ");
            String response = console.readLine("저장하시겠습니까?(Y/N): ");
            if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")) {
                names[cursor] = name;
                emails[cursor] = email;
                tels[cursor] = tel;
                cursor++;
            }

            response = console.readLine("계속 입력하시겠습니까?(Y/N): ");
            if (!(response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")))
                break;

        }

        for (int i = 0; i < cursor; i++) {
            System.out.printf("%s, %s, %s\n", names[i], emails[i], tels[i]);
        }
    }
}
