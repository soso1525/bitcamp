package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* 세션 다루기 - servlet 버전 */
// 서버에 저장하기 때문에 인코딩 따위 필요없음

@Controller
@RequestMapping("/v03/test06")
public class Test06 {

    @RequestMapping(value = "/m1", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m1(HttpSession session) { // 보관소이기 때문에 객체로 저장됨
        session.setAttribute("name", "홍길동");
        session.setAttribute("age", 20); // 객체로 보관되기 때문에 Integer 객체가 들어감 (autoboxing)
        session.setAttribute("working", true);

        return "Session에 name,age,working을 저장하였습니다.";
    }

    @RequestMapping(value = "/m2", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(HttpSession session) {
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name = %s\n", session.getAttribute("name")));
        buf.append(String.format("age = %s\n", session.getAttribute("age")));
        buf.append(String.format("working = %s\n", session.getAttribute("working")));

        return buf.toString();
    }
}
