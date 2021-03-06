import java.util.Scanner;

public class Score {
    String name;
    int[] subjects;
    int sum;
    float aver;

    Score() {
        this.subjects = new int[3];
    }

    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] { kor, eng, math };
        compute();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름? ");
        this.name = sc.nextLine();
        System.out.print("국어? ");
        this.subjects[0] = sc.nextInt();
        System.out.print("엉어? ");
        this.subjects[1] = sc.nextInt();
        System.out.print("수학? ");
        this.subjects[2] = sc.nextInt();
        this.compute();
    }

    void compute() {
        for (int sub : this.subjects)
            this.sum += sub;

        this.aver = this.sum / (float) this.subjects.length;
    }

    void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", this.name, this.subjects[0], this.subjects[1],
                this.subjects[2], this.sum, this.aver);
    }

}
