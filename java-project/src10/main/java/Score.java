
public class Score {
    String name;
    int[] subjects;
    int sum;
    float aver;

    Score(String name, int kor, int eng, int math) {
        this.name = name; // this가 안붙으면 가장 가까운 name을 찾는다 -> 만약 없으면 this가 자동으로 붙음

        // this.subjects[0] = kor;
        // this.subjects[1] = eng;
        // this.subjects[2] = math;

        this.subjects = new int[] { kor, eng, math };
        // this.subjects = {kor, eng, math} 처음에 선언 하고 초기화할 때를 제외하고는 코드 부분에서 이렇게 사용 불가

        compute();
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
