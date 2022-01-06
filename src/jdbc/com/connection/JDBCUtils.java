package jdbc.com.connection;



import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {

    public static Connection getConnection() throws Exception{
        //1.从配置中读取基本信息
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc/com/xiaotu/jdbc.properties");

        //读取基本信息
        Properties prop = new Properties();
        prop.load(is);

        String url = prop.getProperty("url");
        String driverClass = prop.getProperty("driverClass");

        Class.forName(driverClass);

        Connection conn = DriverManager.getConnection(url,prop);

        return  conn;
    }

    public static void closeResource(Connection conn, Statement ps){
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


    public static void closeResource(Connection conn, Statement ps, ResultSet rs){
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

        try {
            if (rs != null){
                rs.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }


}
