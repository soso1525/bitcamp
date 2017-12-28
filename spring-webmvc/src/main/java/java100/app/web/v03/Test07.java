package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

/* 세션 다루기 - Spring framework @SessionAttributes */

@Controller
@SessionAttributes({ "name", "age" }) // name, age, workng 중에 name과 age는 session 보관소에 저장하겠다
// FrontController가 Model 객체 자체를 복사해서 ServletRequest에 저장되고
// annotation에서 설정한 값들은 추가적으로 HttpSession 보관소에 저장한다
@RequestMapping("/v03/test07")
public class Test07 {

    @RequestMapping(value = "/m1", produces = "text/plain;charset=UTF-8")
    public String m1(Model model) { // Map or Model (Model을 많이 사용)

        // Front Controller가 준 Model 객체에 값을 저장하면, 이 값은 ServletRequest에 보관된다.
        // 만약 Model에 저장되는 값의 이름이 클래스 선언부에 붙인 @SessionAttributes에 설정되어 있다면,
        // 그 값은 HttpSession 객체에 보관된다.

        // Model 객체는 FrontController가 ServletRequest 보관소에 복사하여 저장함

        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 20);
        model.addAttribute("working", true);

        return "v03/test07/m1"; // Model에 보관된 값이 ServletRequest에 저장되었는지 확인해보자 - jsp파일로
    }

    @RequestMapping(value = "/m2", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(@ModelAttribute("name") String name, @ModelAttribute("age") int age) {
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name = %s\n", name));
        buf.append(String.format("age = %d\n", age));

        return buf.toString();
    }

    @RequestMapping(value = "/m3", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(@ModelAttribute String name, @ModelAttribute int age) { // 이름 생략하면 에러남
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name = %s\n", name));
        buf.append(String.format("age = %d\n", age));

        return buf.toString();
    }

    @RequestMapping(value = "/m4", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(@ModelAttribute("working") String working) {
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working = %s\n", working));
        return buf.toString(); // 빈 문자열 리턴
    }

    @RequestMapping(value = "/m5")
    public String m2() {
        // model에 대해 어떠한 값도 지정하지 않았지만
        // 이미 session에 보관된 name과 age를 front controller가 servletRequest 보관소에 복사해준다.
        // working까지 복사하지 않는 이유는 @SessionAttributes에 지정한 값이 아니기 때문
        return "v03/test07/m1";
    }
}
