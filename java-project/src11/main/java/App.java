import java.util.Scanner;

public class App {
    static Score[] scores = new Score[100];
    static Scanner sc = new Scanner(System.in);
    static int cursor = 0;

    static boolean confirmLoop(String msg) {
        System.out.print(msg);
        String response = sc.nextLine();
        if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))
            return true;
        return false;
    }

    static void save(Score s) {
        if (cursor < 0 || cursor >= scores.length)
            System.out.println("저장할 수 없습니다");
        scores[cursor++] = s;
    }

    static boolean confirmSave(String msg) {
        System.out.print(msg);
        String response = sc.next();
        if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        while (true) {
            if (cursor < 0 || cursor >= scores.length) {
                System.out.println("저장공간이 부족합니다. 프로그램을 종료합니다");
                return;
            }

            System.out.println();

            Score score = new Score();
            score.input();

            if (confirmSave("저장 하시겠습니까? "))
                save(score);
            sc.nextLine();
            if (!confirmLoop("계속 하시겠습니까? "))
                break;
        }

        System.out.println();
        System.out.printf("%-4s, %4s, %4s, %4s, %4s, %6s\n", "NAME", "KOR", "ENG", "MATH", "SUM", "AVERAGE");

        for (int i = 0; i < cursor; i++)
            scores[i].print();
    }
}
