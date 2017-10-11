package bitcamp.java100;

/* 논리 연산자 */

public class Test15_8 {
    public static void main(String[] args) {
        System.out.println("---------------&&---------------");
        System.out.printf("true && true = %b\n", true && true);
        System.out.printf("true && false = %b\n", true && false);
        System.out.printf("true && true = %b\n", false && true);
        System.out.printf("true && true = %b\n", false && false);

        System.out.println("\n---------------||---------------");
        System.out.printf("true || true = %b\n", true || true);
        System.out.printf("true || false = %b\n", true || false);
        System.out.printf("true || true = %b\n", false || true);
        System.out.printf("true || true = %b\n", false || false);

        System.out.println("\n---------------&---------------");
        System.out.printf("true & true = %b\n", true & true);
        System.out.printf("true & false = %b\n", true & false);
        System.out.printf("true & true = %b\n", false & true);
        System.out.printf("true & true = %b\n", false & false);

        System.out.println("\n---------------|---------------");
        System.out.printf("true | true = %b\n", true | true);
        System.out.printf("true | false = %b\n", true | false);
        System.out.printf("true | true = %b\n", false | true);
        System.out.printf("true | true = %b\n", false | false);

        System.out.println();
        boolean b1 = false;
        boolean result = false && (b1 = true); 
        System.out.printf("b1: %b, result: %b\n", b1, result);

        b1 = false;
        result = false & (b1 = true);
        System.out.printf("b1: %b, result: %b\n", b1, result);
        
        b1 = false; 
        result = true || (b1 = true);
        System.out.printf("b1: %b, result = %b\n", b1, result);
        
        b1 = false;
        result = true | (b1 = true);
        System.out.printf("b21: %b, result = %b\n", b1, result);
    }
}