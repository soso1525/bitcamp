package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test21_8 {
    static class Person {
        String name, email, phone;

        void showInfo() {

            System.out.printf("%-4s\t%-20s\t%-10s\n", name, email, phone);
        }
    }

    static boolean checkMail(String mail) {
        Pattern mp = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+");
        Matcher m = mp.matcher(mail);
        return m.matches();
    }

    static boolean checkPhone(String phone) {
        Pattern mp = Pattern.compile("\\d{3,4}-\\d{4}");
        Matcher m = mp.matcher(phone);
        return m.matches();
    }

    public static void main(String[] args) {

        ArrayList<Person> a = new ArrayList<Person>();

        Console c = System.console();
        while (true) {
            System.out.println("\n===== 정보 입력 =====");
            Person p = new Person();
            p.name = c.readLine("이름: ");
            p.email = c.readLine("이메일: ");
//            if(checkMail(p.email)) {}
            p.phone = c.readLine("전화번호: ");
//            if(checkMail(p.phone)) {}
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
