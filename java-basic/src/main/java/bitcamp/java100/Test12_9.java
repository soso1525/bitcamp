package bitcamp.java100;

public class Test12_9 {
    public static void main(String[] args) {
        //Character 

        char c1 = 44032;
        char c2 = 0xAc00;

        char n1 = 0xC815; //정 51221
        char n2 = 0xC18C; //소 49548
        char n3 = 0xD604; //현 54788

        System.out.printf("%c %c %c\n", n1, n2, n3);

        n1 = '정';
        n2 = '소';
        n3 = '현';

        System.out.printf("%c %c %c\n", n1, n2, n3);

        System.out.println(Integer.toHexString(44032));

        char x = '7';
        int num = x - '0';
        System.out.println(num);

    }
}

