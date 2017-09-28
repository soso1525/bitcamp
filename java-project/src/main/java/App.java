/*
 * This Java source file was generated by the Gradle 'init' task.
 */


/*  ver.03
public class App {
    public static void main(String[] args) {
        String name = "홍 길 동";
        int kor = 100;
        int eng = 97;
        int math = 98;

        int sum = kor + eng + math;
        float aver = sum / 3.0f;

        System.out.printf("이 름: %s\n", name);
        System.out.printf("국 어: %d\n", kor);
        System.out.printf("영 어: %d\n", eng);
        System.out.printf("수 학: %d\n", math);
        System.out.printf("총 점: %d\n", sum);
        System.out.printf("평 균: %f\n", aver);
        System.out.printf("평 균: %.1f\n", aver);

    }
}
/*/

//* ver.04 
public class App {
    public static void main(String[] args) {
        String[] name = {"홍길동", "임꺽정", "유관순"};
        int[] kor = {100, 80, 100};
        int[] eng = {90, 80, 100};
        int[] math = {80, 80, 100};

        for(int i=0; i<3; i++) {
            int sum = (kor[i] + eng[i] + math[i]);            
            float avg = sum / 3.0f;
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", name[i], kor[i], eng[i], math[i], sum, avg);
        }

        System.out.println("\n\n2차원 배열");
        int[][] scores = {{100, 90, 80}, {80, 80, 80}, {100, 100, 100}};

        for(int i=0; i<3; i++) {
            System.out.printf("%-4s, ", name[i]);
            int sum = 0;
            for(int j=0; j<3; j++) {
                System.out.printf("%4d, ", scores[i][j]);
                sum += scores[i][j];
            }

            System.out.printf("%4d, %6.1f\n", sum, sum/3.0f);
        }
    }
}
