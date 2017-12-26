package java100.app.dao;

import java.util.List;
import java100.app.domain.Member;

public interface MemberDao {

    Member selectOne(int no);
    int delete(int no);
    int update(Member member);
    int insert(Member member);
    
    List<Member> selectList();
}
