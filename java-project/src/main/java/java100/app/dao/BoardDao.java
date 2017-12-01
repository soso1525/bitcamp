package java100.app.dao;

import java.util.List;
import java100.app.domain.Board;

public interface BoardDao {
    Board selectOne(int no);
    int delete(int no);
    int update(Board board);
    int insert(Board board);
    List<Board> selectList();
}