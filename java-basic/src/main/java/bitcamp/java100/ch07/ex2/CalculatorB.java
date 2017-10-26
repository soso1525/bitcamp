package bitcamp.java100.ch07.ex2;

public class CalculatorB extends Calculator {
    
    // 위에 필요한 부분은 실행하면서 필요시에 상위클래스 참조
    // 내가 명시적으로 써줄 필요 없음 >> 중복
    
    void remainder(int value) {
        this.result %= value;
    }
}
