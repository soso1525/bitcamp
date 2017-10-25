package bitcamp.java100.ch06.ex2;

import java.io.Console;

public class MessageBox {
    static boolean confirm(String message) {
        Console console = System.console(); // 기존에 있는 콘솔 리턴해줌
        // 현재 JVM에 있는 콘솔 객체를 리턴해주기 때문에 상관없음
        String response = console.readLine(message).toLowerCase();
        if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }
}
