package bitcamp.java100;

import java.io.Console;

public class Test21_6 {

    // 입력받은 숫자의 갯수 counting
    public static void main(String[] args) {

        int[] cnt = new int[10];

        Console c = System.console();
        int n = Integer.valueOf(c.readLine("\n숫자를 입력하세요: "));

        while (n != 0) {
            cnt[n % 10]++;
            n /= 10;
        }

        System.out.println("===== 입력된 숫자의 개수 출력 =====");
        for (int i = 0; i < cnt.length; i++) {
            System.out.println(i + " - " + cnt[i]);
        }
    }

}
