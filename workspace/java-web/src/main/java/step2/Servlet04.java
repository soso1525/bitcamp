package step2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step2/Servlet04")
public class Servlet04 extends AbstractHttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("클라이언트 IP: " + request.getRemoteAddr());
        System.out.println("클라이언트 포트: " + request.getRemotePort());

        System.out.println("URL: " + request.getRequestURL());
        System.out.println("URI: " + request.getRequestURI());
        System.out.println("SERVLET PATH: " + request.getServletPath());
        System.out.println("PATH INFO: " + request.getPathInfo());
        System.out.println("Query String: " + request.getQueryString());
    }

}
