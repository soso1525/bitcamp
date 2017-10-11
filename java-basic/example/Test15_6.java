package bitcamp.java100;

/* 연산자 우선순위 */

public class Test15_6 {
	public static void main(String[] args) {
		
		int r = 2 + 3 * 4;
		System.out.println(r);

		r = 2 + 3 * 4 - 6 / 3 + 7;
		System.out.println(r);

		r = ( 2 + 3 ) * 4; //괄호
		System.out.println(r);
	}
}
