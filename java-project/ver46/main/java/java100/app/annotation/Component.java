package java100.app.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//자동으로 생성할 객체에 대해 붙일 annotation으로
//spring framework에서 사용하는 방식과 동일하게 

@Retention(RetentionPolicy.RUNTIME)
public @interface Component {

    String value() default ""; // 객체를 생성한 후 BeanContainer에 저장할 때 사용할 이름
}
