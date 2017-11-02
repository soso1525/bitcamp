package bitcamp.java100.ch09.ex2;

public class LinkedList {
    Box head;
    Box tail;

    int len;

    public void add(Object value) {
        Box box = new Box();
        box.value = value;

        if (head == null) {
            head = box;
            tail = box;
        } else {
            tail.next = box;

            tail = box;
        }
        len++;
    }

    public int size() {
        return len;
    }

    public Object get(int index) {
        if (index < 0 || index >= len)
            return null;

        Box box = head;

        for (int count = 1; count <= index; count++) {
            // for (int i = 0; i < index; i++) {
            box = box.next;
        }

        return box.value;
    }

    public void insert(int index, Object value) {
        if (index < 0 || index >= len)
            return;

        Box box = new Box();
        box.value = value;

        Box tmp = head;

        if (index == 0) {
            box.next = tmp;
            head = box;
            len++;
            return;
        }

        for (int count = 1; count < index; count++) {
            tmp = tmp.next;
        }

        box.next = tmp.next;
        tmp.next = box;
        len++;
    }

    public Object remove(int index) {
        if (index < 0 || index >= len)
            return null;

        if (index == 0) {
            Object removedValue = head.value;
            head = head.next;
            len--;
            return removedValue;
        }
        Box box = head;
        for (int count = 1; count < index; count++) {
            box = box.next;
        }

        Object removedValue = box.next.value;

        len--;
        if (index == len - 1) {
            tail = box;
        } else {
            box.next = box.next.next;
        }

        return removedValue;
    }

}
