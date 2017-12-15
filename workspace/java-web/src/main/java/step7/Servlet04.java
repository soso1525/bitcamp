package step7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step7/Servlet04")
public class Servlet04 extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
        String op = req.getParameter("op");

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Calculator</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("   <h1>계산 결과</h1>");
        out.println("<p>");
        out.printf("%d %s %d = ", a, op, b);

        switch (op) {
        case "+":
            out.println(a + b);
            break;
        case "-":
            out.println(a - b);
            break;
        case "*":
            out.println(a * b);
            break;
        case "/":
            out.println((float) a / b);
            break;
        default:
            out.println("잘못된 연산자입니다.");
        }

        out.println("</p>");
        
        // 이전 입력 양식으로 돌아가도록 만드는 링크 추가
        out.println("<a href='Servlet03.html'>다시 계산</a>");
        
        out.println("</body>");
        out.println("</html>");
    }

}