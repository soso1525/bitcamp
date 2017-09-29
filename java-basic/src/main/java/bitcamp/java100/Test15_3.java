package bitcamp.java100;

/* 서로 다른 타입의 연산 - 암시적 형변환 */

public class Test15_3 {
	public static void main(String[] args) {
		byte b1 = 20, b2 = 22;
		short s1 = 30, s2 = 33;
		int i1 = 40, i2 = 44;
		long l1 = 50, l2 = 55;
		float f1 = 3.14f, f2 = 45.32f;
		double d1 = 4567.8988, d2 = 9876.5432;
		
		int r1 = b1 + s1;
		r1 = b1 + i1;
		r1 = i1 + s1;

		// r1 = i1 + l1; 연산결과가 long형인데 int형으로 받아서 손실우려
		long r2 = i1 + l1;

		r2 = b1 + l1;
		r2 = s2 + l1;


		// 정수타입 <-> 부동소수점? -> 정수가 부동소수점으로 변환
		/* 전부 컴파일 에러
			long r3 = b1 + f1;
			r3 = s1 + f1;
			r3 = i1 + f1;
			r3 = l1 + f1;
		*/ 

		float r4 = b1 + f1;
		r4 = s1 + f1;
		r4 = i1 + f1;
		r4 = l1 + f1;

		// float r5 = f1 + d1; compile error. result는 double이므로
		double r6 = f1 + d1;
		r6 = b1 + d1;
		r6 = s1 + d1;
		r6 = i1 + d1;
		r6 = l1 + d1;
	}
}

