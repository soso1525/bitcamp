package bitcamp.java100.ch08.ex3;

public class Score {
    protected String name;
    protected int kor, eng, math, sum, no;
    protected float aver;

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getSum() {
        return sum;
    }

    public float getAver() {
        return aver;
    }

    public Score() {
    }

    public Score(int no, String name, int kor, int eng, int math) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.compute();
    }

    // 공개할 필요 없음
    protected void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}
