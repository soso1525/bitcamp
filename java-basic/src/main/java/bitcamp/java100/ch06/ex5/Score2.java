package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Score2 {
    String name;
    int kor, math, eng, sum;
    float aver;

    void inputScore() {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("이름? ");
        this.name = keyScan.nextLine();

        System.out.print("국어? ");
        this.kor = keyScan.nextInt();

        System.out.print("영어? ");
        this.eng = keyScan.nextInt();

        System.out.print("수학? ");
        this.math = keyScan.nextInt();

        this.computeScore();

    }

    void computeScore() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

    void printScore() {
        System.out.printf("%s, %d, %d, %d, %d, %f\n", this.name, this.kor, this.eng, this.math, this.sum, this.aver);
    }
}
