package step9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisSelectList {
    public static void main(String[] args) throws Exception {

        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject()); // 의존객체 주입

        Map<String, Object> data = new HashMap<>();
        data.put("orderColumn", "regdt");
        data.put("align", "desc");

        // List<String> words = new ArrayList<>();
        // words.add("aa");
        // words.add("1");
        // words.add("5");
        // data.put("words", words);

        List<Board> records = boardDao.findAll(data);
        for (Board board : records) {
            System.out.printf("%d,%s,%s,%s\n", board.getNo(), board.getTitle(), board.getCreatedDate(),
                    board.getViewCount());
        }
    }
}