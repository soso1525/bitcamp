package bitcamp.java100.ch19.ex3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Retention(RetentionPolicy.CLASS) --> 기본
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    
    //property 선언은 메소드처럼
    String name();
    int age();
}
