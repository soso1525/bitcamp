package bitcamp.java100;

public class Test17_9 {

    static class Score {
        String name;
        int[] subjects = new int[3];
        int sum;
        float avg;
    }

    static Score createMember(String name, int kor, int eng, int math) {
        Score s = new Score();
        s.name = name;
        s.subjects[0] = kor;
        s.subjects[1] = eng;
        s.subjects[2] = math;

        s.sum = kor + eng + math;
        s.avg = s.sum / 3.0f;

        return s;
    }

    static int exp(int value, int ex) {
        int sum = 1;
        while (ex-- > 0)
            sum *= value;
        return sum;
    }

    public static void main(String[] args) {
        Score score = createMember("홍길동", 100, 90, 80);
        System.out.println(score.name);
        System.out.println(score.subjects[0]);
        System.out.println(score.subjects[1]);
        System.out.println(score.subjects[2]);
        System.out.println(score.sum);
        System.out.println(score.avg);

        System.out.println("\n****************************");
        System.out.println("2 ^ 0 = " + exp(2, 0));
        System.out.println("2 ^ 3 = " + exp(2, 3));
        System.out.println("2 ^ 8 = " + exp(2, 8));
    }
}
