package bitcamp.java100;

public class Test17_11 {

    static int m1(int p) { // p = 1
        return m2(p + 1); // m2(2)
    }

    static int m2(int q) { // q=2
        return m3(q + 1); // m3(3)
    }

    static int m3(int r) { // r = 3
        return m4(r + 1); // m4(4)
    }

    static int m4(int s) { //s = 4
        return s + 1; // return 5;
    }

    public static void main(String[] args) {
        int result = m1(1);
        System.out.println(result);
    }
}
