package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test08")
public class Test08 {

    @RequestMapping(produces="text/csv")
    public String m1() {
        System.out.println("m1(text/csv)");
        return "/hello.jsp";
    }
    
    @RequestMapping(produces="application/json")
    public String m2() {
        System.out.println("m2(application/json)");
        return "/hello.jsp";
    }
    
    @RequestMapping
    public String m3() {
        System.out.println("m3()");
        return "/hello.jsp";
    }
}
