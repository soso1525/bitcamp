package bitcamp.java100.ch09.ex6;

public class ScoreStack {

    private class Box {
        Score value;
        Box next;

        public Box(Score value) {
            this.value = value;
        }
    }

    Box top;

    int len;

    public void push(Score value) {
        Box box = new Box(value);
        box.next = top;
        top = box;
        len++;
    }

    public int size() {
        return len;
    }

    // 무조건 top 객체를 반환하기 때문에 파라미터가 없음
    public Score pop() {
        if (len == 0) // 데이터 없음
            return null;

        Box box = top;
        top = top.next;

        len--;

        return box.value;
    }
}
