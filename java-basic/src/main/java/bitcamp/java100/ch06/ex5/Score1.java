package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Score1 {
    static String name;
    static int kor, math, eng, sum;
    static float aver;

    static void inputScore() {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("이름? ");
        name = keyScan.nextLine();

        System.out.print("국어? ");
        kor = keyScan.nextInt();

        System.out.print("영어? ");
        eng = keyScan.nextInt();

        System.out.print("수학? ");
        math = keyScan.nextInt();

    }

    static void computeScore() {
        sum = kor + eng + math;
        aver = sum / 3f;
    }

    static void printScore() {
        System.out.printf("%s, %d, %d, %d, %d, %f\n", name, kor, eng, math, sum, aver);
    }
}
