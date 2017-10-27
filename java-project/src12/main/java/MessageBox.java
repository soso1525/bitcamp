import java.util.Scanner;

public class MessageBox {
    static boolean confirmLoop(String msg) {
        System.out.print(msg);
        String response = new Scanner(System.in).nextLine();
        if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))
            return true;
        return false;
    }

    static boolean confirmSave(String msg) {
        System.out.print(msg);
        String response = new Scanner(System.in).next();
        if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes"))
            return true;
        return false;
    }
}
