package bitcamp.java100;

/* 서로 다른 타입의 연산 - 명시적 형변환*/

public class Test15_4 {
	public static void main(String[] args) {
		float f1 = 3.141592f;
		int i1 = 7654321;
		System.out.printf("f1 = %f, i1 = %d\n", f1, i1);

		double r1 = f1 + i1; // 7654324.141592 -> 데이터 잘림 (7자리까지만)
		System.out.println(r1);

		//r1 = (double)f1 + i1; r1 = f1 + (double)i1; 명시적 + 암시적 형변환

		r1 = (double)f1 + (double)i1;
		System.out.println(r1);


	}
}
