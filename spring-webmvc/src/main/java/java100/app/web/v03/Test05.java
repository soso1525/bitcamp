package java100.app.web.v03;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* 쿠키 다루기 - @Cookie */
@Controller
@RequestMapping("/v03/test05")
public class Test05 {

    // 쿠키 보내기
    @RequestMapping(value = "/m1", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m1(HttpServletResponse response) {
        response.addCookie(new Cookie("name", "hongkildong"));
        response.addCookie(new Cookie("age", "20"));

        return "쿠키를 보냈습니다!";
    }

    // 쿠키 받기 @CookieValue
    @RequestMapping(value = "/m2", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(@CookieValue("name") String name, @CookieValue("age") int age) {
        // age를 자동 형변환 해주는지 확인 -> 자동 형 변환됨 (string age -> int age 출력됨)
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name = %s\n", name));
        buf.append(String.format("age = %d\n", age));

        return buf.toString();
    }

    /*
     * TEST 방법 1. /v03/test05/m1을 먼저 실행 2. /v03/test05/m2를 실행하여 쿠키값 확인
     */

    @RequestMapping(value = "/m3", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(@CookieValue String name, @CookieValue int age) {
        // 쿠키의 이름을 주지 않아도 가능한지 확인 -> 쿠키 이름 주지 않아도 됨
        // Q. 이름이 같아서 그런건가?
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name = %s\n", name));
        buf.append(String.format("age = %d\n", age));

        return buf.toString();
    }

    @RequestMapping(value = "/m4", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(@CookieValue String working) {
        // working에 대한 정보를 쿠키에 만들어주지 않았을 때 결과 확인
        // Missing cookie 'working' for method parameter of type String
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working = %s\n", working));

        return buf.toString();
    }
    
    @RequestMapping(value = "/m5", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m5(@CookieValue(required=false) String working) {
        // 쿠키에 없는 정보에 대해 required 옵션을 false로 바꾸면 에러 x -> null 값 출력
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working = %s\n", working));

        return buf.toString();
    }
    
    @RequestMapping(value = "/m6", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m6(@CookieValue(defaultValue="true") String working) {
        // 쿠키에 없는 정보에 대해 defaultValue를 지정해주면 값이 없을 때 true 출력
        // 값이 있으면 그 값을 출력함
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working = %s\n", working));

        return buf.toString();
    }

}
