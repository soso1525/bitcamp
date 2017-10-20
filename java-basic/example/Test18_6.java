package bitcamp.java100;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* java.util.String - 정규식 */

public class Test18_6 {
    public static void main(String[] args) {
        String email = "hong@test.com";

        // email pattern : ^[_0-9a-zA-Z-]+@[0-9a-zA-Z-]+(.[_0-9a-zA-Z-]+)*$

        // . : 임의의 문자 한개
        // + : 한개 이상, * : 0개이상, ? : 0 또는 한개
        // \. : 그냥 dot 문자
        // \D : 숫자를 제외한 문자

        System.out.println(email.matches("^\\D.+@.+\\..+"));

        if (email.matches("hong@test.com"))
            System.out.println("email 입니다");
        else
            System.out.println("잘못된 email 형식입니다");

        System.out.println("\n\n이메일만 뽑아내기");
        String str = "홍길동(hong@test.com), 임꺽정(im@test.com), 유관순(yoo@test.com), 안중근(ahn@test.com), 윤봉길(yoon@test.com)";
        // Pattern pattern = Pattern.compile(".+@.+\\..+");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+"); // 영어나 숫자만 잡아내기 대문에 한글과 기호를 제외시키고 인식
        Matcher matcher = pattern.matcher(str);
        // int startIndex = 0;
        // while (matcher.find(startIndex)) {
        // System.out.println(startIndex);
        // if (startIndex != 0)
        // System.out.println(str.charAt(startIndex - 1));
        // String matchString = matcher.group();
        // startIndex = matcher.end();
        //
        // System.out.println(matchString);
        // }

        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);

        }

        System.out.println("\n\n이름만 뽑아내기");

        Pattern kor = Pattern.compile("[가-힣]{3}");
        Matcher korMat = kor.matcher(str);
        while (korMat.find())
            System.out.println(korMat.group());

    }
}