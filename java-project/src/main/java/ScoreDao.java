
public class ScoreDao {
    static Score[] scores = new Score[100];
    static int cursor = 0;

    static boolean checkState() {
        if (cursor < 0 || cursor >= scores.length) {
            System.err.println("저장공간이 부족합니다. 프로그램을 종료합니다");
            return false;
        }

        return true;
    }

    static void save(Score s) {
        if (cursor < 0 || cursor >= scores.length)
            System.err.println("저장할 수 없습니다");
        scores[cursor++] = s;
    }

    static Score get(int index) {
        if (index < 0 || index >= scores.length) {
            System.err.println("잘못된 인덱스 값입니다");
            return null;
        } else
            return scores[index];
    }

    static int size() {
        return cursor;
    }
}
