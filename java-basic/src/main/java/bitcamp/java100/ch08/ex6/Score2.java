package bitcamp.java100.ch08.ex6;

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
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", no="
                + no + ", aver=" + aver + "]";
    }

    @Override //같은 hash code를 리턴하도록 재정의함
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + eng;
        result = prime * result + kor;
        result = prime * result + math;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + no;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Score2 other = (Score2) obj;
        if (eng != other.eng)
            return false;
        if (kor != other.kor)
            return false;
        if (math != other.math)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (no != other.no)
            return false;
        return true;
    }
}
