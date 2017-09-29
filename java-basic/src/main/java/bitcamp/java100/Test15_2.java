package bitcamp.java100;

/* byte와 short의 연산결과 => int */

public class Test15_2 {
	public static void main(String[] args) {
		short s1 = 10;
		short s2 = 20;
		//short s3 = s1+s2;
		int result = s1 + s2;
		long r2 = s1 + s2; //int보다 더 크기 때문에 무조건 okay
		System.out.println(result);
		System.out.println(r2);
	}
}

