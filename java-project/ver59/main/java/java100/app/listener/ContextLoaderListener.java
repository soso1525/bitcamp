package java100.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.util.DataSource;

//웹애플리케이션 시작 시 스프링 IoC 컨테이너를 준비시키는 일을 한다
//@WebListener -> DD file에서 정보를 받기 위해 주서처리
public class ContextLoaderListener implements ServletContextListener {

    public static AnnotationConfigApplicationContext iocContainer;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        System.out.println("ContextInitialized 실행");
        
        ServletContext webApplicationInfo = sce.getServletContext();
        String configClassName = webApplicationInfo.getInitParameter("contextConfigLocation");
        try {
            Class<?> configClass = Class.forName(configClassName);
            iocContainer = new AnnotationConfigApplicationContext(configClass);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();
    }
}
