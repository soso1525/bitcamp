package step11;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step11/Servlet08")
public class Servlet08 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("클라이언트가 보낸 쿠키: ");

        // 쿠키는 전부 다 가져올 수만 있음 (원하는 데이터만 뽑아낼 수 없음)
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.printf("%s = %s\n", cookie.getName(), URLDecoder.decode(cookie.getValue(), "UTF-8"));
                
                // getValue()가 리턴하는 문자열은 UTF-8 코드를 URL 인코딩 한 것
                // 이 정보를 바탕으로 원래의 유니코드 값으로 복원하라는 의미
                // Decoder가 하는 일
                // URL 인코딩 문자열 -> UTF-8 -> 2바이트 유니코드 -> String 객체 
            }
        }
    }
}
