package step11;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 쿠키에 한글데이터 사용하기

@SuppressWarnings("serial")
@WebServlet("/step11/Servlet07")
public class Servlet07 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // 쿠키 이름은 한글로 작성하면 오류, 값은 한글로 작성 가능
        // 값이 UTF-8 형식으로 전달되어 7bit를 초과하게 됨
        // 네트워크 장비 중 오래된 장비일 경우 7bit 까지만 인식할 수 있어 데이터가 잘릴 수 있음
        // 해결책? URL 인코딩 하여 보내라

        // res.addCookie(new Cookie("이름", "hong"));
        res.addCookie(new Cookie("name", URLEncoder.encode("ABC123홍길동", "UTF-8")));

        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("쿠키를 보냈음!");
    }
}
