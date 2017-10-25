package bitcamp.java100;

/* 반복문  - do while*/

public class Test16_5 {
    public static void main(String[] args) {
        System.out.println("\n=======================\n");
        int i = 0;
        do {
            System.out.println(i++);
        } while (i <= 5);

        System.out.println("\n=======================\n");

        i = 0;
        do {
            System.out.print("=> ");
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
