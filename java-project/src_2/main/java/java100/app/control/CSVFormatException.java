package java100.app.control;

//익셉션 다루는 방법 2가지있는데
//extends Exception 하면 반드시 try - catch문으로 감싸주어야 함

// Exception을 상속받는 예외클래스들은 특별한 용도를 지니기보다 이름을 통해 어떠한 문제가 있는지 알려주기 위해 사용
public class CSVFormatException extends Exception {

    public CSVFormatException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public CSVFormatException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

}
