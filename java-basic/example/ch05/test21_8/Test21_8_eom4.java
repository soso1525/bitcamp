package bitcamp.java100.test21_8;

import java.io.Console;

public class Test21_8_eom4 {
    static Console console;
    static Contact[] contacts;

    static int cursor = 0;

    static class Contact {
        String name;
        String email;
        String tel;
    }

    static void initContact() {
        console = System.console();
        contacts = new Contact[100];

        if (console == null) {
            System.err.println("console을 지원하지 않습니다");
            System.exit(1);
        }
    }

    static Contact inputCotact() {
        Contact contact = new Contact();

        System.out.println();
        contact.name = console.readLine("이름?: ");
        contact.email = console.readLine("이메일? ");
        contact.tel = console.readLine("전화? ");
        return contact;
    }

    static boolean confirm(String message) {
        String input = console.readLine(message + "(Y/N): ");
        if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes"))
            return true;
        return false;
    }

    static void printContacts() {

        for (int i = 0; i < cursor; i++) {
            System.out.printf("%s, %s, %s\n", contacts[i].name, contacts[i].email, contacts[i].tel);
        }
    }

    public static void main(String[] args) {

        initContact();

        while (cursor < contacts.length) {

            Contact contact = inputCotact();

            if (confirm("저장하시겠습니까?")) {
                contacts[cursor] = contact;
                cursor++;
            }

            if (!confirm("계속 입력하시겠습니까?"))
                break;
        }

        printContacts();
    }
}
