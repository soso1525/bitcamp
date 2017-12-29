package step9;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// sql_session_factory를 만들어주는 공장 클래스(factory class)

public class SqlSessionFactoryBean { //원래는 sql session factory factory bean 인데 -> sql session factory bean로 바꿈
    public static SqlSessionFactory getObject() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step9/mybatis-config.xml");
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
}
