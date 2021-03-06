package step3;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/step3/Servlet01")
public class Filter01 implements javax.servlet.Filter {
    FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter01.init()");
        this.config = filterConfig;
    }

    @Override
    public void destroy() {
        System.out.println("Filter01.destroy()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        //서비스 호출 전에 할 일 
        System.out.println("Filter01.doFilter() - before");
        chain.doFilter(request, response);
        //서비스 호출 후에 할 일
        System.out.println("Filter01.doFilter() - after");
    }
}
