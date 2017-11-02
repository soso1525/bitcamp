package bitcamp.java100.ch09.ex5;

/* 컬렉션 - 3. Queue */
//First in First out (FIFO) 선입선출

public class Queue {

    private class Box {
        Object value;
        Box next;

        public Box(Object value) {
            this.value = value;
        }
    }

    Box head;
    Box tail;

    int len;

    public void add(Object value) {
        Box box = new Box(value);

        if (tail != null) {
            tail.next = box;
        }

        tail = box;
        len++;

        if (head == null)
            head = box;
    }

    public int size() {
        return len;
    }

    public Object poll() {
        if (len == 0) // 데이터 없음
            return null;

        Box box = head;
        head = head.next;

        len--;

        return box.value;
    }
}
