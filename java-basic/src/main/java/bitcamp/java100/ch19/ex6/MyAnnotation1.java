package bitcamp.java100.ch19.ex6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Retention(RetentionPolicy.CLASS) --> 기본
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {

    // property 선언은 메소드처럼
    String[] name() default { "홍길동", "임꺽정" };

    int[] age() default { 20, 30 };
}
