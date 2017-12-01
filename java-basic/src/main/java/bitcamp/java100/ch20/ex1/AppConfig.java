package bitcamp.java100.ch20.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정 정보를 다루는 클래스라고 알려줌
public class AppConfig {

    // 메소드 위에 어노테이션 붙이면 메소드가 리턴한 값을 container에 저장
    @Bean("str1") // bean 객체를 만들 때 이름
    String getString1() {
        return new String();
    }

    @Bean("str2")
    String getString2() {
        return new String("Hello!");
    }

}
