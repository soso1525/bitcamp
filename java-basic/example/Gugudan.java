package bitcamp.java100;

public class Gugudan {
    public static void main(String[] args) {

        System.out.println("\n========= for =========\n");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            } 
            System.out.println();
        }

        /*
         * System.out.println("\n========= while =========\n"); int i = 0; while (i++ <
         * 9) { int j = 0; while (j++ < 9) { System.out.printf("%d x %d = %d\n", i, j, i
         * * j); } System.out.println(); }
         */

        System.out.println("\n========= tab - for =========\n");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }

        System.out.println("\n========= tab - while =========\n");
        int i = 0;
        while (i++ < 9) {
            int j = 0;
            while (j++ < 9) {
                System.out.printf("%d x %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }

    }
}
