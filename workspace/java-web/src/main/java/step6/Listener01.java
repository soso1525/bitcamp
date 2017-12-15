package step6;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener01 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext webApplicationContext = sce.getServletContext(); // 한 개의 context가 아니고 web app 전체
        String driver = webApplicationContext.getInitParameter("driver");
        String url = webApplicationContext.getInitParameter("url");
        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
