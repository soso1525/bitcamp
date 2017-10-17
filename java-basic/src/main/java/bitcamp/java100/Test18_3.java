package bitcamp.java100;

/* java.util.String */

public class Test18_3 {
    public static void main(String[] args) {

        // costants pool
        String s1 = "ABC가각간";
        String s2 = "ABC가각간";
        String s3 = "ABC가각간";

        // heap
        String s4 = new String("ABC가각간");
        String s5 = new String("ABC가각간");
        String s6 = new String("ABC가각간");

        if (s1 == s2)
            System.out.println("s1 == s2");
        if (s1 == s3)
            System.out.println("s1 == s3");

        if (s1 != s4)
            System.out.println("s1 != s4");
        if (s1 != s5)
            System.out.println("s1 != s5");
        if (s1 != s6)
            System.out.println("s1 != s6");

        if (s1 == "ABC가각간")
            System.out.println("s1 == ABC가각간");
    }
}
