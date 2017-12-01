package java100.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.App3;
import java100.app.domain.Room;

public class RoomDao {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다.");
        }
    }

    public int delete(int no) {
        try (PreparedStatement pstmt = App3.con
                .prepareStatement("delete from ex_room where no=?");) {

            pstmt.setInt(1, no);

            return pstmt.executeUpdate();

        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    public int insert(Room room) {
        try (PreparedStatement pstmt = App3.con.prepareStatement(
                "insert into ex_room(loc, name, capacity) values(?,?,?)");) {

            pstmt.setString(1, room.getloc());
            pstmt.setString(2, room.getName());
            pstmt.setInt(3, room.getCapacity());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    public List<Room> selectList() {
        try (PreparedStatement pstmt = App3.con.prepareStatement(
                "select no, loc, name, capacity from ex_room");
                ResultSet rs = pstmt.executeQuery();) {

            ArrayList<Room> list = new ArrayList<>();

            while (rs.next()) {
                Room room = new Room();
                room.setNo(rs.getInt("no"));
                room.setloc(rs.getString("loc"));
                room.setName(rs.getString("name"));
                room.setCapacity(rs.getInt("capacity"));
                list.add(room);
            }

            return list;
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }
}
