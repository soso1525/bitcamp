package step2;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@SuppressWarnings("serial")
@WebServlet("/step2/Servlet03")
public class Servlet03 extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("클라이언트 IP: " + req.getRemoteAddr());
        System.out.println("클라이언트 포트: " + req.getRemotePort());

        HttpServletRequest httpRequest = (HttpServletRequest) req;

        System.out.println("URL: " + httpRequest.getRequestURL());
        System.out.println("URI: " + httpRequest.getRequestURI());
        System.out.println("SERVLET PATH: " + httpRequest.getServletPath());
        System.out.println("PATH INFO: " + httpRequest.getPathInfo());
        System.out.println("Query String: " + httpRequest.getQueryString());
        

    }

}
