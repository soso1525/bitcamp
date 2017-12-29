package step9;

public class MybatisInsert {
    public static void main(String[] args) throws Exception {

        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
        
        // insert를 실행할 때 Board 객체를 넘겨줄 것이다.
        Board board = new Board();
        board.setTitle("룰루랄라");
        board.setContents("신나라 점심시간이당");

        int count = boardDao.insert(board);
        System.out.printf("%d 개가 입력되었습니다.", count);
    }
}
