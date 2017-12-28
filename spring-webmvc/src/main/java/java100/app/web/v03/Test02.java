package java100.app.web.v03;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v03/test02")
public class Test02 {

    // test > http://localhost:9999/spring-webmvc/app/v03/test02/메소드

    @RequestMapping("/m1")
    @ResponseBody // hello.jsp 파일이 아니라 문자열 그대로 "hello"가 출력됨
    // ResponseBody는 리턴 값을 contents로 간주함
    public String m1() {
        return "hello";
    }

    @RequestMapping("/m2")
    @ResponseBody
    public String m2(HttpServletResponse response) {
        response.setContentType("text/plain;charset=UTF-8");
        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        return "한글!";
    }

    // 클라이언트가 text/plain MIME 타입의 데이터를 요구하고
    // 또한 그 데이터가 UTF-8로 인코딩 되길 원할 때 이 메서드를 호출하라고 지정
    // Accept 요청 헤더에 대해 처리할 때 produces 사용 (v02/Test08.java 참고)
    // 요청에 따라 문자집합이 처리되지 않을 수 있음
    @RequestMapping(value = "/m3", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(HttpServletResponse response) {
        return "한글!";
    }

    // 데이터 덩어리를 entity or body라고 함
    @RequestMapping("/m4")
    @ResponseBody
    public HttpEntity<String> m4() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        headers.setContentType(MediaType.TEXT_PLAIN);
        HttpEntity<String> entity = new HttpEntity<>("한글!");
        return entity;
    }

    @RequestMapping("/m5")
    @ResponseBody
    public ResponseEntity<String> m5() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        ResponseEntity<String> entity = new ResponseEntity<>("한글!", headers, HttpStatus.OK);
        return entity;
    }

    @RequestMapping("/m6")
    @ResponseBody
    public Object m6() {

        // 클라이언트가 보낸 데이터를 자바객체로 변환
        // 또한 요청 핸들러가 리턴한 자바 객체를 json 형태로 변환
        // message converter 설정으로 Member 객체를 json 형태로 출력해줌

        return new Member("홍길동", 20, true);
        
        // 만약 리턴 값이 일반 java object라면, 
        // message converter에 등록된 변환기가 가동되어
        // JSON 형식의 문자열로 바뀌어 출력
    }
}
