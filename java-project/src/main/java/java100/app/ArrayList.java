package java100.app;

public class ArrayList {
    Object[] scores = new Score[100];
    static int cursor = 0;

    boolean checkState() {
        if (cursor < 0 || cursor >= scores.length) {
            System.err.println("저장공간이 부족합니다. 프로그램을 종료합니다");
            return false;
        }

        return true;
    }

    void save(Object obj) {
        if (cursor < 0 || cursor >= scores.length)
            System.err.println("저장할 수 없습니다");
        scores[cursor++] = obj;
    }

    Object get(int index) {
        if (index < 0 || index >= scores.length) {
            System.err.println("잘못된 인덱스 값입니다");
            return null;
        } else
            return scores[index];
    }

    int size() {
        return cursor;
    }
}
