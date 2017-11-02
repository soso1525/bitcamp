package bitcamp.java100.ch09.ex6;

public class ContactStack {

    private class Box {
        Contact value;
        Box next;

        public Box(Contact value) {
            this.value = value;
        }
    }

    Box top;

    int len;

    public void push(Contact value) {
        Box box = new Box(value);
        box.next = top;
        top = box;
        len++;
    }

    public int size() {
        return len;
    }

    // 무조건 top 객체를 반환하기 때문에 파라미터가 없음
    public Contact pop() {
        if (len == 0) // 데이터 없음
            return null;

        Box box = top;
        top = top.next;

        len--;

        return box.value;
    }
}
