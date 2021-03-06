package java100.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataSource {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    private ArrayList<Connection> list = new ArrayList<>();

    synchronized public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (list.size() > 0)
            return list.remove(0);

        Class.forName(this.driverClassName);
        // 생성된 connection이 없을 때 새로 만들어 리턴
        return DriverManager.getConnection(this.url, this.username, this.password);
    }

    synchronized public void returnConnection(Connection con) {
        try {
            if (con == null)
                return;
            if (con.isClosed())
                return;
        } catch (Exception e) {

        }
        list.add(con);
    }

    synchronized public void close() {
        for (Connection con : list) {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
