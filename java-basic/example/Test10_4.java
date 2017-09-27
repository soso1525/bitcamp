package bitcamp.java100;

public class Test10_4 {
    public static void main(String[] args) {
        //formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d")
        System.out.printf("%4$2s, %3$3s, %2$4s, %1$5s\n", "a", "b", "c", "d");
        System.out.printf("%2s, %3s, %4s, %5s\n", "a", "b", "c", "d");
    }
}
