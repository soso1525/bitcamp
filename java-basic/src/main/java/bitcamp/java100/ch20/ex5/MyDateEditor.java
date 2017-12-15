package bitcamp.java100.ch20.ex5;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

//property 변환기 만들기 

public class MyDateEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        // parameter로 넘어온 text가 xml파일에서 입력한 값
        // 이 값을 가지고 우리가 원하는 객체를 만들고
        // 내부 메소드를 사용하여 setting해주면 됨

        this.setValue(Date.valueOf(text));
    }
}
