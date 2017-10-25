
public class Score {
    String name;
    int[] subjects = new int[3];
    int sum;
    float aver;

    Score(String name, int kor, int eng, int math) {
        this.name = name; //this가 안붙으면 가장 가까운 name을 찾는다 -> 만약 없으면 this가 자동으로 붙음
        this.subjects[0] = kor;
        this.subjects[1] = eng;
        this.subjects[2] = math;
        compute(this);
    }

    static void compute(Score score) {
        for (int sub : score.subjects)
            score.sum += sub;

        score.aver = score.sum / (float) score.subjects.length;
    }

    static void print(Score score) {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", score.name, score.subjects[0], score.subjects[1],
                score.subjects[2], score.sum, score.aver);
    }
}
