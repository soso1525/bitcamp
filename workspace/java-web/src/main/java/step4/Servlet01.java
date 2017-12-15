package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step4/Servlet01")
public class Servlet01 extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("ABC각각간abc똘똠똥123"); //출력스트림은 기본으로 ISO-8859-1 문자표에 따라 변환하여 출력
    }

}
