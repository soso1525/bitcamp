package bitcamp.java100.ch08.ex4;

public class Score2 {
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

    public Score2() {
    }

    public Score2(int no, String name, int kor, int eng, int math) {
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (this == obj)
            return true;

        if (obj.getClass() != Score2.class)
            return false;

        Score2 s2 = (Score2) obj;
        
        if(this.no != s2.no) return false;
        if(!this.name.equals(s2.name)) return false;
        if(this.kor != s2.kor) return false;
        if(this.eng != s2.eng) return false;
        if(this.math != s2.math) return false;

        return true;
    }
}
