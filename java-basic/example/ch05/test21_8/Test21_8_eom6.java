package bitcamp.java100.test21_8;

import java.io.Console;

public class Test21_8_eom6 {
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
        contacts = new Contact[3];

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

    static void add(Contact contact) {
        if (cursor >= contacts.length)
            throw new RuntimeException("최대 저장 개수 초과");
        contacts[cursor] = contact;
        cursor++;
    }

    static Contact get(int index) {
        if (index < 0 || index >= cursor)
            throw new RuntimeException("유효하지 않은 인덱스입니다.");
        return contacts[index];
    }

    static int size() {
        return cursor;
    }

    static boolean confirm(String message) {
        String input = console.readLine(message + "(Y/N): ");
        if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes"))
            return true;
        return false;
    }

    static void printContacts() {

        for (int i = 0; i < size(); i++) {
            Contact contact = get(i);
            System.out.printf("%s, %s, %s\n", contact.name, contact.email, contact.tel);
        }
    }

    public static void main(String[] args) {

        initContact();

        while (true) {

            Contact contact = inputCotact();

            if (confirm("저장하시겠습니까?"))
                try {
                    add(contact);
                } catch (RuntimeException e) {
                    System.err.println("최대 저장 개수를 초과하였습니다.");
                    break;
                }

            if (!confirm("계속 입력하시겠습니까?"))
                break;
        }

        printContacts();
    }
}
