package java100.app.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.dao.BoardDao;
import java100.app.dao.DaoException;
import java100.app.domain.Board;
import java100.app.util.DataSource;

public class BoardDaoImpl implements BoardDao {

    DataSource ds;

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }

    public Board selectOne(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;

        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "select no, title, conts, regdt, vwcnt from ex_board where no=?");
            pstmt2 = con
                    .prepareStatement("update ex_board set vwcnt=? where no=?");
            pstmt.setInt(1, no);
            rs = pstmt.executeQuery();

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
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                pstmt.close();
                pstmt2.close();
            } catch (Exception e) {
            }

            ds.returnConnection(con);
        }
    }

    public int delete(int no) {

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement("delete from ex_board where no=?");
            pstmt.setInt(1, no);

            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }

            ds.returnConnection(con);
        }
    }

    public int update(Board board) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "update ex_board set title=?, conts=?, regdt=now() where no=?");

            pstmt.setString(1, board.getTitle());
            pstmt.setString(2, board.getContent());
            pstmt.setInt(3, board.getNo());

            return pstmt.executeUpdate();

        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }

            ds.returnConnection(con);
        }
    }

    public int insert(Board board) {

        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "insert into ex_board (title, conts, regdt) values(?, ?, now())");
            pstmt.setString(1, board.getTitle());
            pstmt.setString(2, board.getContent());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
            }

            ds.returnConnection(con);
        }
    }

    public List<Board> selectList() {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "select no, title, regdt, vwcnt from ex_board");
            rs = pstmt.executeQuery();

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
        } finally {
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                pstmt.close();
            } catch (Exception e) {
            }

            ds.returnConnection(con);
        }
    }
}
