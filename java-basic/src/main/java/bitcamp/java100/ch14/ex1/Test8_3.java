package bitcamp.java100.ch14.ex1;

// recursive method

public class Test8_3 {
    static int sigma(int n) {
        // if (n == 0)
        // return n;
        return n + sigma(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Sigma: " + sigma(10));

        System.out.println();
    }
}
