package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test15")
public class Test15 {

    // test 방법
    // http://localhost:9999/spring-webmvc/v02/test15/board/100

    @RequestMapping("/board/{no}")
    public String m1(@PathVariable("no") int no) {
        System.out.println(no);
        System.out.println("------------------------");
        return "/hello.jsp";
    }

    @RequestMapping("/category/{catno}/product/{prodno}")
    public String m1(@PathVariable("catno") int catno, @PathVariable("prodno") int prodno) {
        System.out.println("cat: " + catno);
        System.out.println("prod: " + prodno);
        System.out.println("------------------------");
        return "/hello.jsp";
    }

    @RequestMapping("/category2/{catno}/product2/{prodno}")
    public String m3(@PathVariable int catno, @PathVariable int prodno) {
        System.out.println("cat2: " + catno);
        System.out.println("prod2: " + prodno);
        System.out.println("------------------------");
        return "/hello.jsp";
    }

    // test방법
    // http://localhost:9999/spring-webmvc/app/v02/test15/java-sdk-8.0.151.exe
    // ext는 .exe를 추출할 때 사용할 변수명
    // name도 version도 각 부분을 추출할 때 사용할 변수명
    // name = java-sdk
    // version = 8.0.151

    @RequestMapping("/software/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d+}{ext:\\.[a-z]+}")
    public String m4(@PathVariable String name, @PathVariable String version, @PathVariable String ext) {
        System.out.println("name: " + name);
        System.out.println("version: " + version);
        System.out.println("ext: " + ext);
        System.out.println("------------------------");
        return "/hello.jsp";
    }
}
