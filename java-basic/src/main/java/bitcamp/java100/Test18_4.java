package bitcamp.java100;

/* java.util.String */

public class Test18_4 {
    public static void main(String[] args) {

        String s1 = "ABC가각간";
        String s2 = new String("ABC가각간");

        if (s1 != s2)
            System.out.println("s1 != s2");
        
        if(s1.equals(s2)) System.out.println("s1 == s2");

    }
}
