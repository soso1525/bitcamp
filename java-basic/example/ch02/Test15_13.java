package bitcamp.java100;

/* 복합 대입 연산자 */

public class Test15_13 {
    public static void main(String[] args) {
        int sum = 0;

        // 일반 대입 연산자 (assignment)
        sum = sum + 100;
        sum = sum + 100;

        System.out.println(sum);

        sum = 0;
        sum += 100;
        sum += 100;

        System.out.println(sum);

    }
}