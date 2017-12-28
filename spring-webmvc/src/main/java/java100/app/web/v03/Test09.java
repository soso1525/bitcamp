package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/v03/test09")
@SessionAttributes({ "name", "age" })
// 이 annotation이 없으면 front controller는 jsp를 위해 하던 session 데이터 복사 일을 하지 않는다.
// 또한 메서드를 호출할 때 @ModelAttribute에 지정된 값을 넘겨주지 않는다
// 다른 말로 @ModelAttribute로 세션 데이터를 얻고 싶으면 @SessionAttribute 어노테이션 선언해줘라!
public class Test09 {

    // TEST 방법
    // 1. 웹 브라우저를 모두 닫고 새로운 브라우저를 열어 세션을 만든다
    // 2. /app/v03/test08/m1 을 요청하여 세션에 값을 보관한다.
    //

    @RequestMapping(value = "/m1")
    public String m1(HttpSession session, Model model) {
        return "v03/test09/m1";
    }

    @RequestMapping(value = "/m2", produces = "text/plain;charset=UTF-8") //direct로 데이터 출력하니까 한글 깨지지 말라고
    @ResponseBody // 데이터 직접 출력
    public String m2(@ModelAttribute("name") String name, @ModelAttribute("age") String age) {
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name = %s\n", name));
        buf.append(String.format("age = %s\n", age));
        return buf.toString();
    }

}