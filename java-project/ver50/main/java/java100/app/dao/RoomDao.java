package java100.app.dao;

import java.util.List;
import java100.app.domain.Room;

public interface RoomDao {

    int delete(int no);
    int insert(Room room);
    List<Room> selectList();
}
