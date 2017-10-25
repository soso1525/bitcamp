package bitcamp.java100;

/*비트 이동 연산자*/

public class Test15_12 {
    public static void main(String[] args) {
        int v = 87; // 0b_0101_0111
        // 32bit - 0000_0000_0000_0000_0000_0000_0101_0111

        System.out.println("v=87");
        System.out.println(v >> 1); // 2^1
        System.out.println(v >> 2); // 2^2
        System.out.println(v >> 3); // 2^3
        System.out.println(v >> 4); // 2^4

        System.out.println("\n>>> operator");
        System.out.println(v >>> 1); // 2^1
        System.out.println(v >>> 2); // 2^2
        System.out.println(v >>> 3); // 2^3
        System.out.println(v >>> 4); // 2^4

        v = -87;
        System.out.println("\nv = -87");
        System.out.println(v >> 1); // 2^1
        System.out.println(v >> 2); // 2^2
        System.out.println(v >> 3); // 2^3
        System.out.println(v >> 4); // 2^4

        /* 주의! 음수가 양수로 변함 */
        // 빈자리를 무조건 0으로 채우면서 벌어지는 일
        System.out.println("\n>>> operator");
        System.out.println(v >>> 1); // 2^1
        System.out.println(v >>> 2); // 2^2
        System.out.println(v >>> 3); // 2^3
        System.out.println(v >>> 4); // 2^4

        v = 5;
        System.out.println("\nv = 5");
        System.out.println(v << 1); // 2^1
        System.out.println(v << 2); // 2^2
        System.out.println(v << 3); // 2^3
        System.out.println(v << 4); // 2^4

        v = -5;
        System.out.println("\nv = 5");
        System.out.println(v << 1); // 2^1
        System.out.println(v << 2); // 2^2
        System.out.println(v << 3); // 2^3
        System.out.println(v << 4); // 2^4

        for (int i = 0; i < 40; i++) {
            System.out.printf("%s, %d\n", Integer.toBinaryString(v << i), v << i);
        }
    }
}