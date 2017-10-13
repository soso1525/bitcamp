package bitcamp.java100;

public class Star {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n========================\n");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n========================\n");

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n========================\n");

        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n========================\n");

        for (int i = 1; i <= n; i++) {

            for (int k = i; k <= ((2 * n) - 1) / 2; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n========================\n");

        for (int i = n; i >= 1; i--) {

            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
