package java100.app;

public class ArrayList<T> {
    private Object[] list = new Object[10000];
    static int cursor = 0;

    boolean checkState() {
        if (cursor < 0 || cursor >= list.length) {
            System.err.println("저장공간이 부족합니다. 프로그램을 종료합니다");
            return false;
        }

        return true;
    }

    void save(T obj) {
        if (cursor < 0 || cursor >= list.length)
            System.err.println("저장할 수 없습니다");
        list[cursor++] = obj;
    }

    @SuppressWarnings("unchecked")
    T get(int index) {
        if (index < 0 || index >= list.length) {
            System.err.println("잘못된 인덱스 값입니다");
            return null;
        } else
            return (T) list[index];
    }

    int size() {
        return cursor;
    }
}
