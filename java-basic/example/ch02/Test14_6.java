package bitcamp.java100;

/* Reference Array */

public class Test14_6 {
	public static void main(String[] args) {
		class Score {
			String name;
			int kor;
			int eng;
			int math;
			int sum;
			float aver;

			void compute() { // 새로운 데이터 타입의 연산자(operator)
				sum = kor + eng + math;
				aver = sum / 3.0f;
			}

			void print() {
				System.out.printf("%s, %d, %d, %d, %d, %f\n", name, kor, eng, math, sum, aver);
			}
		}

		Score[] scores = new Score[3];
		scores[0] = new Score();
		scores[1] = new Score();
		scores[2] = new Score();

		scores[0].name = "홍길동";
		scores[0].kor = 100;
		scores[0].eng = 100;
		scores[0].math = 100;
		scores[0].compute();

		scores[1].name = "임꺽정";
		scores[1].kor = 90;
		scores[1].eng = 90;
		scores[1].math = 90;
		scores[1].compute();

		scores[2].name = "유관순";
		scores[2].kor = 100;
		scores[2].eng = 100;
		scores[2].math = 100;
		scores[2].compute();
		
		for(int i=0; i<scores.length; i++) {
			System.out.print((i+1) + "번째 >> ");
			System.out.printf("%s, %d, %d, %d, %d, %f\n", scores[i].name, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver);
		}
	}
}