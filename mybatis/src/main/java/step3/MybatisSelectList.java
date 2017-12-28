package step3;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectList {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("step3/mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // selectList() -> List타입 리턴
        List<Map> records = sqlSession.selectList("JdbcTestMapper.findAll"); // namespace명.SQL아이디

        // List에 들어갈 자료형은 xml파일에서 resultType을 어떻게 주었느냐에 따라 달림
        // 이 예제에서는 resultType이 Map
        // Map 객체에는 한 record 값이 들어감 => map#1 --- map#2 --- map#3 ---....

        for (Map record : records) {
            System.out.printf("%d, %s, %s, %s\n", record.get("no"), record.get("title"), record.get("conts"), record.get("regdt"));
        }

        sqlSession.close();
        System.out.println("종료!");
    }
}
