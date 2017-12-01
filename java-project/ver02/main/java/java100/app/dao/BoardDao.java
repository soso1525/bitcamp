package java100.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.App3;
import java100.app.domain.Board;

public class BoardDao {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다.");
        }
    }

    public Board selectOne(int no) {
        try (PreparedStatement pstmt = App3.con.prepareStatement(
                "select no, title, conts, regdt, vwcnt from ex_board where no=?");
                PreparedStatement pstmt2 = App3.con.prepareStatement(
                        "update ex_board set vwcnt=? where no=?");) {
            pstmt.setInt(1, no);
            ResultSet rs = pstmt.executeQuery();

            Board board = null;

            int updateCnt = 0;
            if (rs.next()) {
                board = new Board();
                updateCnt = rs.getInt("vwcnt") + 1;
                board.setNo(no);
                board.setTitle(rs.getString("title"));
                board.setContent(rs.getString("conts"));
                board.setRegDate(rs.getDate("regdt"));
                board.setViewCount(updateCnt);
            }

            pstmt2.setInt(1, updateCnt);
            pstmt2.setInt(2, no);
            pstmt2.executeUpdate();

            return board;

        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    public int delete(int no) {
        try (PreparedStatement pstmt = App3.con
                .prepareStatement("delete from ex_board where no=?");) {
            pstmt.setInt(1, no);

            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    public int update(Board board) {
        try (PreparedStatement pstmt = App3.con.prepareStatement(
                "update ex_board set title=?, conts=?, regdt=now() where no=?");) {

            pstmt.setString(1, board.getTitle());
            pstmt.setString(2, board.getContent());
            pstmt.setInt(3, board.getNo());

            return pstmt.executeUpdate();

        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    public int insert(Board board) {
        try (PreparedStatement pstmt = App3.con.prepareStatement(
                "insert into ex_board (title, conts, regdt) values(?, ?, now())");) {

            pstmt.setString(1, board.getTitle());
            pstmt.setString(2, board.getContent());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    public List<Board> selectList() {
        try (PreparedStatement pstmt = App3.con.prepareStatement(
                "select no, title, regdt, vwcnt from ex_board");
                ResultSet rs = pstmt.executeQuery();) {

            ArrayList<Board> list = new ArrayList<>();

            while (rs.next()) {
                Board board = new Board();
                board.setNo(rs.getInt("no"));
                board.setTitle(rs.getString("title"));
                board.setRegDate(rs.getDate("regdt"));
                board.setViewCount(rs.getInt("vwcnt"));
                list.add(board);
            }

            return list;
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }
}
