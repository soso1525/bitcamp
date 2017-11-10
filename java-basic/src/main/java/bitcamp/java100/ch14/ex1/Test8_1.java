package bitcamp.java100.ch14.ex1;

// recursive method

public class Test8_1 {
    static int sigma(int n) {
        if (n == 0)
            return n;

        return n + sigma(n - 1);
    }

    static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Sigma: " + sigma(5));

        System.out.println();

        printStar(5);
        printStar(4);
        printStar(3);
        printStar(2);
        printStar(1);
    }
}
