package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/* 세션 무효화시키기 */

@Controller
@RequestMapping("/v03/test08")
@SessionAttributes({ "name", "age" })
public class Test08 {

    // 일부 값은 Model객체를 통해 간접적으로 세션에 보관하고
    // 일부 값은 직접 Session 객체에 보관해보자

    @RequestMapping(value = "/m1", produces = "text/plain;charset=UTF-8")
    public String m1(HttpSession session, Model model) {

        // Model에 저장한 값들은 ServletRequst에 자동 보관된다 (Front Controller가 복사함)
        // 위에서 @SessioAttributes에 name과 age를 세션 보관소에 저장하게 했음
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 20);
        model.addAttribute("working", true); // 직접 session 보관소에 저장할 데이터

        session.setAttribute("working", true);

        // 보관소에 저장된 값을 확인해보자
        return "v03/test08/m1";
    }

    // 세션 무효화하기1
    @RequestMapping(value = "/m2", produces = "text/plain;charset=UTF-8")
    public String m2(HttpSession session) {
        session.invalidate();
        // invalidate()로 세션을 무효화 시키면 세션을 새로 만들게 된다.
        // 이 때 @SessionAttributes에 지정한 값을 새로 만든 세션에 보관하면서 name과 age에 대한 값만 들어간다.
        // 내부적으로 @SessionAttributes에 지정한 값을 별도의 메모리에 관리한다는 뜻
        // 그래서 m2 호출 후 m2.jsp 실행시키면 working 값만 비어있는 것을 확인할 수 있다.

        return "v03/test08/m1";
    }

    // 세션 무효화하기2
    // TEST 방법: m1실행 후 m3 실행
    @RequestMapping("/m3")
    public String m3(SessionStatus status) {
        
        status.setComplete();
        
        // setComplete을 호출하면 @SessionAttributes로 지정한 값만 삭제된다
        /* 
           결과 값 - name:
                     age:
                     working: true 
         */
        
        return "v03/test08/m1";
    }
    
    @RequestMapping("/m4")
    public String m4(SessionStatus status, HttpSession session) {
        
        session.invalidate();
        status.setComplete();
        
        return "v03/test08/m1";
    }
}