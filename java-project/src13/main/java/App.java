
public class App {

    public static void main(String[] args) {
        ScoreDao sd = new ScoreDao();
        while (sd.checkState()) {

            System.out.println();

            Score score = new Score();
            score.input();

            if (MessageBox.confirmSave("저장 하시겠습니까? "))
                sd.save(score);
            if (!MessageBox.confirmLoop("계속 하시겠습니까? "))
                break;
        }

        System.out.println();
        System.out.printf("%-4s, %4s, %4s, %4s, %4s, %6s\n", "NAME", "KOR", "ENG", "MATH", "SUM", "AVERAGE");

        for (int i = 0; i < sd.size(); i++)
            sd.get(i).print();
    }
}
