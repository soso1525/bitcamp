package bitcamp.java100.test21.ex8;

public class ContactArray {
    static Contact[] contacts = new Contact[100];
    static int cursor = 0;

    static void add(Contact contact) {
        contacts[cursor] = contact;
        cursor++;
    }

    static Contact get(int index) {
        return contacts[index];
    }

    static int size() {
        return cursor;
    }
}
