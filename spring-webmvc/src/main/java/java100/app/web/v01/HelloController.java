package java100.app.web.v01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        return "/hello.jsp";
    }
    
}
