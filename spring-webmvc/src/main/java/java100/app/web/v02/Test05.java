package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v02/test05")
public class Test05 {

    // parameter 존재 유무
    // http://localhost:9999/spring-webmvc/app/v02/test05
    // http://localhost:9999/spring-webmvc/app/v02/test05?menu=1
    
    @RequestMapping()
    public String get() {
        System.out.println("m1()");
        return "/hello.jsp";
    }

    @RequestMapping(params="menu")
    public String post() {      
        System.out.println("m2()");
        return "/hello.jsp";
    }
    
    @RequestMapping(params="command")
    public String m1Get() {
        System.out.println("m3()");
        return "/hello.jsp";
    }

    @RequestMapping(params= {"menu", "command"})
    public String m1Post() {
        System.out.println("m4()");
        return "/hello.jsp";
    }
}
