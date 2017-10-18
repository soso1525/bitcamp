package bitcamp.java100;

import java.io.Console;

public class Test21_3 {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Did not support");
            System.exit(1);
        }

        String name = console.readLine("이름?(예: 홍길동) ");
        int age = Integer.valueOf(console.readLine("나이?(예: 20) "));
        // boolean working = Boolean.valueOf(console.readLine("재직여부?(예: true) "));
        boolean working = false;
        String tmp = console.readLine("재직여부?(예: Y/N) ");
        if (tmp.equals("Y"))
            working = true;
        float gpa = Float.valueOf(console.readLine("졸업학점?(예: 4.3) "));

        System.out.println("\n===== 출력결과 =====");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("재직여부 : " + working);
        System.out.printf("졸업학점 : %.2f\n", gpa);
    }
}
