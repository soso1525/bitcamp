package step10;

/* Refresh2 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/Servlet03")
public class Servlet03 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        if (name == null) {
            out.println("<meta http-equiv='Refresh' content='3;url=ErrorServlet'>");
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>포함</title>");
        out.println("</head>");
        out.println("<body>");
        if (name == null) {
            out.println("실행 오류! 3초 후에 페이지 이동");
        } else {
            out.printf("<p>%s님 환영합니다.", name);
        }
        out.println("</body>");
        out.println("</html>");
    }
}
