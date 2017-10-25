package bitcamp.java100;

/* call-by-value vs call-by-reference */

public class Test17_14 {

    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap(): a = " + a + ", b = " + b);
    }

    static void swap2(int[] r) {
        int tmp = r[0];
        r[0] = r[1];
        r[1] = tmp;

        System.out.println("swap(): a = " + r[0] + ", b = " + r[1]);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        swap(a, b);
        System.out.println("swap(): a = " + a + ", b = " + b);

        System.out.println("==================================");
        int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 7;
        swap2(arr);
        System.out.println("swap(): a = " + arr[0] + ", b = " + arr[1]);
    }
}
