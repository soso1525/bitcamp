package bitcamp.java100;

/* 새로운 데이터 타입에 대해 사용할 연산자 만들기 */

public class Test14_5 {
    public static void main(String[] args) {
        class Score {
			String name;
			int kor;
			int eng;
			int math;
			int sum;
			float aver;

            void compute() { //새로운 데이터 타입의 연산자(operator)
				sum = kor + eng + math;
				aver = sum / 3.0f;
			}
		}

        Score s1 = new Score();
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 100;
        s1.compute();

        System.out.printf("%s, %d, %d, %d, %d, %f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);

        Score s2 = s1;
		s1 = new Score();
        s1.name = "임꺽정";
		s1.kor = 90;
		s1.eng = 90;
		s1.math = 97;
        s1.compute(); // 연산자 실행 = 메소드 호출 = 메시지 전송 

        System.out.printf("%s, %d, %d, %d, %d, %f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
    }
}