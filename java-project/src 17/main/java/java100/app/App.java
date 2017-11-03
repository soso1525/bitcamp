package java100.app;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        ArrayList<Score> list = new ArrayList<Score>();
        while (true) {

            System.out.println();

            Score score = new Score();
            score.input();

            if (MessageBox.confirmSave("저장 하시겠습니까? "))
                list.add(score);
            if (!MessageBox.confirmLoop("계속 하시겠습니까? "))
                break;
        }

        System.out.println();
        System.out.printf("%-4s, %4s, %4s, %4s, %4s, %6s\n", "NAME", "KOR", "ENG", "MATH", "SUM", "AVERAGE");

        // for (int i = 0; i < list.size(); i++)
        // // ((Score) list.get(i)).print();
        // list.get(i).print();

        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext())
            iterator.next().print();
    }
}
