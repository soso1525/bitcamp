package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/other/other/Servlet06")
public class Servlet04 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("클라이언트가 보낸 쿠키: ");

        // 쿠키는 전부 다 가져올 수만 있음 (원하는 데이터만 뽑아낼 수 없음)
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.printf("%s = %s\n", cookie.getName(), cookie.getValue());
            }
        }
    }
}
