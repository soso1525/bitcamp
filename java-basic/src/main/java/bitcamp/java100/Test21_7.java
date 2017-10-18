package bitcamp.java100;

import java.io.Console;

public class Test21_7 {

    // 거꾸로 출력
    public static void main(String[] args) {
        Console c = System.console();
        String str = c.readLine("\n숫자나 영어로 된 문자열 입력: ");
        System.out.println(new StringBuilder(str).reverse().toString());
    }
}
