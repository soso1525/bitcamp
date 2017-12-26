package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v03/test01")
public class Test01 {

    // test > http://localhost:9999/spring-webmvc/v03/test01.html

    // View component URL return
    @RequestMapping("/m1")
    public String m1() {
        return "v03/test01/m1"; 
    }
    
    @RequestMapping("/m2")
    public void m2() {
        System.out.println("Test01.m2()...");  
        // app-servlet.xml에 등록한 view resolver 방식
        // 특별한 jsp에대한 return 문 없어도 xml파일에 등록된 방식대로 view component url을 계산하여 실행함
        // <property name="prefix" value="/" />
        // <property name="suffix" value=".jsp" />
        // /v03/test01/m2.jsp 가 된다 (prefix + 요청핸들러url + postfix)
     
    }

}
