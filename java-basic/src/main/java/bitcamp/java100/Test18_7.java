package bitcamp.java100;

/* java.util.String - StringBuffer */

public class Test18_7 {
    public static void main(String[] args) {
        String s1 = "Hello!";
        String s2 = s1.replace("l", "x");

        // String은 대표적인 immutable object
        System.out.println(s1); // 값을 replace했다고 s1자체가 바뀌지 않는다
        System.out.println(s2);

        // StringBuffer & StringBuilder는 Mutable object
        StringBuffer sb1 = new StringBuffer("Hello!");
        sb1.append(" World!");
        System.out.println(sb1);
        sb1.replace(2, 4, "xx");
        System.out.println(sb1);

    }
}