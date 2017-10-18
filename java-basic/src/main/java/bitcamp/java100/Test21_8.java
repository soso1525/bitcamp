package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8 {
    static class Person {
        String name, email, phone;

        void showInfo() {
            // System.out.println("이름 : " + name);
            // System.out.println("이메일: " + email);
            // System.out.println("전화번호: " + phone);

            System.out.printf("%-4s\t%-20s\t%-10s\n", name, email, phone);
        }
    }

    static boolean checkEmail(String email) {

        return true;
    }

    static boolean checkPhone(String phone) {

        return true;
    }

    public static void main(String[] args) {

        ArrayList<Person> a = new ArrayList<Person>();

        Console c = System.console();
        while (true) {
            System.out.println("\n===== 정보 입력 =====");
            Person p = new Person();
            p.name = c.readLine("이름: ");
            p.email = c.readLine("이메일: ");
            p.phone = c.readLine("전화번호: ");
            a.add(p);
            System.out.println("저장하였습니다");

            char loop = c.readLine("계속하시겠습니까?(Y/N): ").charAt(0);
            if (loop == 'y' || loop == 'Y')
                continue;
            else
                break;
        }

        System.out.printf("\n\n%-4s\t%-20s\t%-10s\n", "이름", "e-mail", "phone");
        for (Person p : a) {
            p.showInfo();
        }
    }
}
