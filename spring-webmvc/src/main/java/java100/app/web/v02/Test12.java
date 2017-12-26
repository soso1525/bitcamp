package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test12")
public class Test12 {

    @RequestMapping("m1")
    public String m1(String name, int age, boolean working, float height) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(height);
        System.out.println("------------------");
        return "/hello.jsp";
    }

    @RequestMapping("m2")
    public String m2(java.util.Date birthDate) {
        System.out.println(birthDate);
        System.out.println("------------------");
        return "/hello.jsp";
    }
    
    // Front controller 클라이언트로부터 요청이 들어오면 
    // 클라이언트가 보낸 데이터를 적절하게 변환하기 위해
    // 변환기를 셋팅한다. (Web Data Binding)
    // 문자열을 다른 타입의 값으로 변환시키는 객체를 'WebDataBinder'라 부른다.
    // 스프링은 문자열을 primitive type으로 바꿀 수 있도록 기본 변환기를 제공한다.
    // 그 외의 타입은 개발자가 만들어 셋팅해야 한다.
    // @InitBinder가 붙은 메서드는 front controller가 문자열을 특정 타입의 값으로 바꾸기 전에
    // WebDataBinder를 추가로 설정하기 위해 호출되는 메서드이다.
    // 그래서 요청이 들어올 때마다 매번 호출된다.
    // 즉 요청을 처리하기 전에 문자열을 다른 타입으로 바꿔주는 변환기를 먼저 설치한 후 요청 핸들러를 호출하는 것이다.
    
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        System.out.println("initBinder()");
//        //문자열을 날짜 객체로 만들어 줄 도구를 준비한다
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false); //날짜 형식을 엄격하게 검사해라
//        
//        // 스프링에서 제공하는 문자열을 날짜 객체로 변환시켜주는
//        // 커스텀 에디터를 준비하여 WebDataBinder에 등록한다.
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//        // first parameter = 문자열을 어떤 타입으로 바꿀 것인지
//        // second parameter = 문자열을 원하는 타입 객체로 만들어준다 (실제로는 위에서 작업이 이루어짐)
//        // second parameter의 booleand은 빈 문자열에 대해 바꿀 것인지 말 것인지 결정
//        
//    }
}
