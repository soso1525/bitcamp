package bitcamp.java100;

/* 비트연산자 */

public class Test15_10 {
    public static void main(String[] args) {
        int v1 = 0b0101_1100; // 2진수 0b로 시작
        int v2 = 0b0110_0110;

        int result = v1 & v2;
        System.out.println(" & " + java.lang.Integer.toBinaryString(result));
        
        result = v1 | v2;
        System.out.println(" | " + java.lang.Integer.toBinaryString(result));
        
        result = v1 ^ v2; //exclusive or (xor)
        System.out.println(" ^ " + java.lang.Integer.toBinaryString(result));
        
        result = ~v1 ;
        System.out.println(" ~ " + java.lang.Integer.toBinaryString(result));
        
    }
}