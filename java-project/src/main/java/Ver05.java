
public class Ver05 {
    public static void main(String[] args) {
        // class는 객체를 생성하기 위한 청사진으로 메모리를 설계도와 같음
        class Score {
            String name;
            int kor, eng, math, sum = 0;
            float avg;

            void showScore() {
                System.out.println("Name: " + this.name);
                System.out.println("Kor: " + this.kor + "\tEng: " + this.eng + "\tMath: " + math);
                System.out.println("Sum: " + this.sum + "\tAverage: " + this.avg);
            }
        }

        Score s1 = new Score(); // new 키워드를 사용해서 메모리를 진짜로 할당받음
        Score s2 = new Score();
        Score s3 = new Score();

        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 90;
        s1.math = 80;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.avg = s1.sum / 3.0f;

        s2.name = "임꺽정";
        s2.kor = 80;
        s2.eng = 80;
        s2.math = 80;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.avg = s2.sum / 3.0f;

        s3.name = "유관순";
        s3.kor = 100;
        s3.eng = 100;
        s3.math = 100;
        s3.sum = s3.kor + s3.eng + s3.math;
        s3.avg = s3.sum / 3.0f;

        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.avg);
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.avg);
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.avg);

        System.out.println("----- 내가 정의한 함수 -----");
        s1.showScore();
        s2.showScore();
        s3.showScore();

    }
}
