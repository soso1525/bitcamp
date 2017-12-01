package java100.app.dao;

import java.util.List;

import java100.app.domain.Score;

public interface ScoreDao {
    Score selectOne(int no);
    int delete(int no);
    int update(Score score);
    int insert(Score score);
    List<Score> selectList();

}
