package bitcamp.java100;

/* 사용자 정의 데이터 타입 만들기 */

public class Test14_1 {
    public static void main(String[] args) {
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        //여기까지는 설계도 완성

        Score r1;
        r1 = new Score(); //실제 메모리 할당받고 객체가 생성
        r1.name = "홍길동";
        r1.kor = 100;
        r1.eng = 98;
        r1.math = 95;
        r1.sum = r1.kor + r1.eng + r1.math;
        r1.aver = r1.sum / 3.0f;

        System.out.printf("%-4s %4d %4d %4d %4d %6.1f\n", r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);
    }
}