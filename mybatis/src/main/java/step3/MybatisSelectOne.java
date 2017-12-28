package step3;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectOne {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step3/mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Map<String, Object> record = sqlSession.selectOne("JdbcTestMapper.findByNo", 3);
        
        System.out.println();
        
        System.out.println("번호: " + record.get("no"));
        System.out.println("제목: " + record.get("title"));
        System.out.println("내용: " + record.get("conts"));
        System.out.println("날짜: " + record.get("regdt"));
        System.out.println("조회수: " + record.get("vwcnt"));
        sqlSession.close();
        
        System.out.println();
        System.out.println("종료!");
    }
}
