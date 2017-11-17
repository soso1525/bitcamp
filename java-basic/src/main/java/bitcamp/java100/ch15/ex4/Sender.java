package bitcamp.java100.ch15.ex4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws Exception {
        String serverIP = "192.168.0.58";
        int serverPort = 9999;
        Socket socket = new Socket(serverIP, serverPort);

        Scanner keyboard = new Scanner(System.in);

        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println("sender");

        while (true) {
            System.out.print("입력: ");
            out.println(keyboard.nextLine());
            
        }
    }
}
