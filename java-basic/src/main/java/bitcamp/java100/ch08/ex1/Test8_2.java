package bitcamp.java100.ch08.ex1;

class Score2 {
    String name;
    int kor, eng, math;
    private int sum;
    private float avg;

    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.avg = this.sum / 3f;
    }

    public int getSum() {
        return sum;
    }

    public float getAvg() {
        return avg;
    }
}

public class Test8_2 {
    public static void main(String[] args) {
        Score2 s = new Score2();
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        s.compute();

        System.out.printf("%s, %d, %d, %d, %d, %f\n", s.name, s.kor, s.eng, s.math, s.getSum(), s.getAvg());
    }
}
