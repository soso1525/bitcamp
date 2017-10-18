package bitcamp.java100;

import java.io.Console;

public class Test21_2 {
    public static void main(String[] args) {
        Console console = System.console(); // IDE말고 os console창에서 실행시켜야 정상 작동
        String line = console.readLine("입력하세요: "); 
        System.out.println(line);
    }
}
