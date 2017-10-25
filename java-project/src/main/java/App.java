import java.util.Scanner;

public class App {
    static Score[] scores = new Score[100];
    static Scanner sc = new Scanner(System.in);
    static int cursor = 0;

    static Score input() {
        System.out.print("이름? ");
        String name = sc.nextLine();
        System.out.print("국어? ");
        int kor = sc.nextInt();
        System.out.print("엉어? ");
        int eng = sc.nextInt();
        System.out.print("수학? ");
        int math = sc.nextInt();

        return new Score(name, kor, eng, math);
    }

    static boolean confirmLoop(String msg) {
        System.out.print(msg);
        String response = sc.nextLine();
        if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))
            return true;
        return false;
    }

    static void save(Score s) {
        if (cursor < 0 || cursor > scores.length)
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
            System.out.println();
            Score s = input();
            if (confirmSave("저장 하시겠습니까? "))
                save(s);
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
