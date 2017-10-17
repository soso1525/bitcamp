package bitcamp.java100;

import java.io.UnsupportedEncodingException;

/* java.util.String - replace() */

public class Test18_5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "ABC가각간";
        String s2 = s1.replace("BC", "하하하");

        System.out.println(s1);
        System.out.println(s2);

        // String 인스턴스의 값은 한 번 정해지면 변경할 수 업다 - immutable instance

        System.out.println(s1.charAt(4));
        System.out.println(s1.indexOf("가각"));

        s1 = "ABBCDEBBFGH";
        System.out.println("\ns1 = \"ABBCDEBBFGH\"");
        System.out.println(s1.lastIndexOf("BB")); // 뒤에서부터 찾음
        System.out.println(s1.indexOf("BB"));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3, 6));

        s1 = "홍길동";

        System.out.println("\ns1 = 홍길동");
        System.out.println("\"홍길\"로 시작하는가? " + s1.startsWith("홍길"));
        System.out.println("\"길\"로 시작하는가? " + s1.startsWith("길"));
        System.out.println("\"동\"으로 끝나는가? " + s1.endsWith("동"));

        s1 = "홍길동, 유관순, 임꺽정, 안중근, 윤봉길, 이육사, 윤동주";
        System.out.println("\ns1 = \"홍길동, 유관순, 임꺽정, 안중근, 윤봉길, 이육사, 윤동주\"");
        System.out.println("s1에 \"꺽정\"을 포함하고 있는가? " + s1.contains("꺽정"));
        System.out.println("s1에 \"꺽정\"을 포함하고 있는가? " + s1.contains("김꺽정"));

        String s3 = "ABC";
        String s4 = "가각간";

        System.out.println("\n\"ABC\" + \"가각간\" = " + s3.concat(s4));
        System.out.println(s3);
        System.out.println(s4);

        s3 = new String("탕수육");
        s4 = new String("탕수육2");

        String s5 = new String("탈수육");
        String s6 = new String("탕수육");

        System.out.println("\n문자열 비교 (compareTo)");
        System.out.println("탕수육  vs 탕수육  = " + s3.compareTo(s6));
        System.out.println("탕수육  vs 탕수육2 = " + s3.compareTo(s4));
        System.out.println("탕수육  vs 탈수육  = " + s3.compareTo(s5));

        s1 = "홍길동";
        s2 = ""; // 빈문자열
        s3 = null; // 인스턴스없음

        System.out.println("\nisEmpty()");
        System.out.println("\"홍길동\" : " + s1.isEmpty());
        System.out.println("\"\" : " + s2.isEmpty());
        // System.out.println(s3.isEmpty()); 런타임 에러 (NullPointerException)

        System.out.println("\nlength()");
        System.out.println(s1.length());
        System.out.println(s2.length());

        s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
        System.out.println("\nsplit() return String[]");
        String[] arr = s1.split(",");
        for (String s : arr)
            System.out.print(s + " - ");

        s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
        System.out.println("공백 split()");
        arr = s1.split(" ");
        System.out.println(arr.length);

        s1 = "";
        arr = s1.split(",");
        System.out.println(arr.length);

        s1 = "Hong Gill Dong";
        System.out.println("\nUpper/LowerCase() - s1: \"Hong Gill Dong\"");
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        s1 = " 홍길동 ";
        System.out.println("\ntrim() - \" 홍길동  \""); // 문자열 중간의 공백은 제거하지 않음
        System.out.println("\"" + s1.trim() + "\""); // 문자열 양쪽 끝의 공백만 제거해줌

        System.out.println("\n\n");
        s1 = " \t홍\t길 동 \n입니다. \n\n\n\t\n";
        System.out.println(s1);
        System.out.println(s1.trim());

        s1 = "ABC\n가각간\n똘똠똥";
        byte[] bytes = s1.getBytes();
        for (byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }

        System.out.println();

        bytes = s1.getBytes("UTF-8");
        for (byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }

        
        System.out.println("\n\n다양한 자료형 >>>");
        s1 = String.valueOf(true);
        s2 = String.valueOf(3.14);
        s3 = String.valueOf(100);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("\nstring 더하기>>>>>");
        s1 = "ABC";
        s2 = "가각간";
        s3 = s1 + s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
