package bitcamp.java100.ch09.ex6;

public class Score {
    String name;
    int kor, eng, math, sum;
    float aver;

    public Score() {

    }

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        compute();
    }

    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
