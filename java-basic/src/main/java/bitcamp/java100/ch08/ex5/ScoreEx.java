package bitcamp.java100.ch08.ex5;

// overriding X

public class ScoreEx extends Score {
    int sci;
    int soc;

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
        this.compute();
    }

    public int getSoc() {
        return soc;
    }

    public void setSoc(int soc) {
        this.soc = soc;
        this.compute();
    }

    public ScoreEx() {

    }

    public ScoreEx(int no, String name, int kor, int eng, int math, int sci, int soc) {
        // super class의 생성자 재활용
        super(no, name, kor, eng, math);
        this.sci = sci;
        this.soc = soc;
        this.compute();

    }
}
