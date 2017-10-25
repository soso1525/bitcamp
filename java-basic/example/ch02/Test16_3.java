package bitcamp.java100;

/* 조건문  - switch */

public class Test16_3 {
    public static void main(String[] args) {

        int level = 2;
        level = 0;
        switch (level) {
        case 0:
            System.out.println("손님");
            break;
        case 1:
            System.out.println("회원");
            break;
        case 2:
            System.out.println("관리자");
            break;
        default:
            System.out.println("유효하지 않은 회원입니다.");
            break;
        }

        byte b = 10;
        short s = 10;
        int i = 10;
        char c = 10;
        long l = 10;
        float f = 10.f;
        double d = 10;
        boolean bool = true;
        String str = "hello";

        switch (b) {
        }
        switch (s) {
        }
        switch (i) {
        }
        switch (c) { }
        switch (str) {  
        }
        // switch (l) {}
        // switch (f) {}
        // switch (d) {}
        // switch (bool) {}

        System.out.println("\n================================\n");

        level = 0;
        switch (level) {
        case 0:
            System.out.println("손님");
        case 1:
            System.out.println("회원");
        case 2:
            System.out.println("관리자");
        default:
            System.out.println("유효하지 않은 회원입니다.");
        }

        System.out.println("\n================================\n");

        String v1 = "어린이";
        switch (v1) {
        case "유아":
        case "노인":
            System.out.println("무료승차");
            break;
        case "어린이":
        case "중학생":
        case "고등학생":
        case "미성년":
            System.out.println("청소년 요금입니다");
            break;
        case "성인":
        case "외국인":
            System.out.println("일반요금입니다");
            break;
        default:
            System.out.println("요금 게산 대상이 아닙니다.");
            break;
        }

        switch (10) { 
        case 10:
            System.out.println("값입니다");
        }

    }
}