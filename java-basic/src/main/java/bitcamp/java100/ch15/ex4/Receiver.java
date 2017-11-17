package bitcamp.java100.ch15.ex4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Receiver {
    public static void main(String[] args) throws Exception {
        String serverIP = "192.168.0.58";
        int serverPort = 9999;
        Socket socket = new Socket(serverIP, serverPort);

        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println("receiver");

        Scanner in = new Scanner(socket.getInputStream());
        
        while(true) {
            System.out.println(in.nextLine());
        }
    }
}
