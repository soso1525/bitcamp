package bitcamp.java100;

/* 증감 연산자 prefix & postfix */

public class Test15_5 {
	public static void main(String[] args) {
		int a = 10, b = 10;
		
		a = a + 1; b = b - 1;
		System.out.printf("a: %d, b: %d\n", a, b);

		a = 10; b = 10;
		++a; --b;
		System.out.print("Prefix >> ");
		System.out.printf("a: %d, b: %d\n", a, b);

		a = 10; b = 10;
		a++; b--;
		System.out.print("Postfix >> ");
		System.out.printf("a: %d, b: %d\n", a, b);
		
		a = 10; b = 10;
		int r1 = ++a;
		int r2 = --b;
		System.out.printf("a: %d, b: %d, r1: %d, r2: %d\n", a, b, r1, r2);

		a = 10; b = 10;
		r1 = a++;
		r2 = b--;
		System.out.printf("a: %d, b: %d, r1: %d, r2: %d\n", a, b, r1, r2);

		a = 10; b = 10;
		a = ++a;
		System.out.println(a);
		
		b = b++;
		System.out.println(b);

		a = 5;
		r1 = ++a + ++a * ++a;
		System.out.printf("a: %d, r1: %d\n", a, r1);

		a = 5;
		r1 = a++ + a++ * a++;
		System.out.printf("a: %d, r1: %d\n", a, r1);
		
	}
}
