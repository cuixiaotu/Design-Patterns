package jdbc.com.preparedstatement;

import jdbc.com.connection.JDBCUtils;
import jdbc.com.statement.StatementTest;
import jdbc.com.xiaotu.Connect;
import org.junit.Test;

import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Properties;

public class PreparedStatementTest {




    @Test
    public void testUpdate2(){
        String sql = "delete from customers where id = ?";
        update(sql,21);
    }

    public void update(String sql,Object ...args){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps);
        }
    }




    @Test
    public void testUpdate(){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();


            String  sql = "update customers set name = ?  where id = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1,"theodore");
            ps.setInt(2,20);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps);
        }

    }


    @Test
    public void testInsert() throws Exception {
        InputStream is = PreparedStatementTest.class.getClassLoader().getResourceAsStream("jdbc/com/xiaotu/jdbc.properties");

        Properties prop = new Properties();
        prop.load(is);

        String url = prop.getProperty("url");
        String driverClass = prop.getProperty("driverClass");

        Class.forName(driverClass);

        Connection conn = DriverManager.getConnection(url,prop);

        System.out.println(conn);

        String sql = "insert into customers(name,email,birth) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1,"崔小土");
        ps.setString(2,"616364596@qq.com");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = sdf.parse("1992-09-29");
        ps.setDate(3, new Date(date.getTime()));

        try {
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null){
                    ps.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }

            try {
                if (conn != null){
                    conn.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }

        }

    }


}
