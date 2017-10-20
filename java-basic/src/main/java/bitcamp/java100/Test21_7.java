package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;

public class Test21_7 {

    static void reverseString(String str) {
        int startIndex = str.length() - 1;
        for (int i = startIndex; i >= 0; i--) {
            System.out.print(str.charAt(i) + "");
        }
        System.out.println();
    }

    static void reverseString2(String str) {

        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);

        int i = 0, j = str.length() - 1;

        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

            i++;
            j--;
        }

        for (char c : arr)
            System.out.print(c);
        System.out.println();
    }

    // 거꾸로 출력
    public static void main(String[] args) {
        Console c = System.console();
        String str = c.readLine("\n숫자나 영어로 된 문자열 입력: ");
        System.out.println();
        System.out.println("StringBuilder.reverse(): " + new StringBuilder(str).reverse());
        System.out.print("reverseString(String str): ");
        reverseString(str);
        System.out.print("reverseString2(String str): ");
        reverseString2(str);
    }
}
