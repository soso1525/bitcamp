package bitcamp.java100.test21_8;

import java.io.Console;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Person {
    String name, email, phone;

    void showInfo() {
        System.out.printf("%-5s\t%-10s\t%-10s\n", this.name, this.email, this.phone);
    }
}

public class Test21_8 {

    static boolean checkMail(String str) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    static boolean checkPhone(String str) {
        Pattern p = Pattern.compile("\\d{3,4}-\\d{4}");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        ArrayList<Person> a = new ArrayList<Person>();
        Console c = System.console();

        while (true) {
            System.out.println("\n===== 사용자 정보 입력 =====");
            Person p = new Person();
            p.name = c.readLine("이름: ");
            while (true) {
                p.email = c.readLine("이메일: ");
                if (!checkMail(p.email)) {
                    System.out.println("잘못된 형식입니다");
                    System.out.println("다시 입력해주세요 (xxx@xxx.com)");
                    continue;
                } else
                    break;
            }

            while (true) {
                p.phone = c.readLine("전화번호: ");
                if (!checkPhone(p.phone)) {
                    System.out.println("잘못된 형식입니다");
                    System.out.println("다시 입력해주세요 (xxxx-xxxx)");
                    continue;
                } else
                    break;
            }

            a.add(p);
            System.out.println("저장이 완료되었습니다.");
            char loop = c.readLine("\n계속 하시겠습니까?(Y/N): ").charAt(0);
            if (loop == 'y' || loop == 'Y')
                continue;
            else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        System.out.println("\n\n===== 사용자 정보 출력 =====");
        System.out.printf("%-5s\t%-10s\t%-10s\n", "이름", "이메일", "전화번호");
        for (Person p : a) {
            p.showInfo();
        }
    }
}
