package java100.app.domain;

import java100.app.control.CSVFormatException;

public class Score {

    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int sum;
    protected float aver;

    // : ### 생성자
    // : > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Score() {
    }

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        this.compute();
    }

    public Score(String csv) throws CSVFormatException {
        String[] rec = csv.split(",");
        if (rec.length < 4) // 이름하고 국영수만 있으면 된다 -> 합계와 평균은 국영수를 기반으로 계산하면 되기 때문
            // 생성자에 들어가는 문구는 개발자들끼리 확인하기 위한 것. 큰 의미 없음
            // 코드를 보고 직관적으로 이해하기 위해
            throw new CSVFormatException("CSV 데이터 항목의 개수가 올바르지 않습니다.");

        try {
            this.name = rec[0];
            this.kor = Integer.parseInt(rec[1]);
            this.eng = Integer.parseInt(rec[2]);
            this.math = Integer.parseInt(rec[3]);
            this.compute(); // 합계와 평균은 국영수로 항상 새로 계산
        } catch (Exception e) {
            throw new CSVFormatException("CSV 데이터 형식이 올바르지 않습니다.");
        }
    }

    public String toCSVString() {
        return String.format("%s,%d,%d,%d,%d,%f", this.getName(), this.getKor(), this.getEng(), this.getMath(),
                this.getSum(), this.getAver());
    } // 이렇게 함으로써 score자체의 변화에 따라 다른 클래스를 변화시킬 필요가 없어짐

    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", aver="
                + aver + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }

    public int getSum() {
        return sum;
    }

    public float getAver() {
        return aver;
    }

    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

}