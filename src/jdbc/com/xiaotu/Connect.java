package jdbc.com.xiaotu;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connect {

    public static void main(String[] args) {
        try {
            testConnect5();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //jdbc的连接方式一
    public static void testConnect1() throws SQLException {
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/xiaotu";
        Driver driver = new com.mysql.cj.jdbc.Driver();
        Properties info = new Properties();
        info.setProperty("user",user);
        info.setProperty("password",password);
        Connection connection = driver.connect(url,info);

        System.out.println(connection);
    }


    //jdbc的连接方式二 去掉三方类名 使用反射
    public static void testConnect2() throws Exception {
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        // Driver driver = (Driver) clazz.newInstance();
        Driver driver =  (Driver) clazz.getDeclaredConstructor().newInstance();

        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/xiaotu";

        Properties info = new Properties();
        info.setProperty("user",user);
        info.setProperty("password",password);
        Connection connection = driver.connect(url,info);

        System.out.println(connection);
    }

    //jdbc的连接方式三 使用DriverManager替换Driver
    public static void testConnect3() throws Exception {

        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        // Driver driver = (Driver) clazz.newInstance();
        Driver driver =  (Driver) clazz.getDeclaredConstructor().newInstance();

        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/xiaotu";

        DriverManager.registerDriver(driver);
        Connection connection  = DriverManager.getConnection(url,user,password);

        System.out.println(connection);
    }


    //jdbc的连接方式四 注释注册驱动的代码
    public static void testConnect4() throws Exception {
        //1.连接的基本信息
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/xiaotu";

        //2.加载Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 在mysql的Driver中，声明了如下的操作：
        /**
         *     static {
         *         try {
         *             DriverManager.registerDriver(new Driver());
         *         } catch (SQLException var1) {
         *             throw new RuntimeException("Can't register driver!");
         *         }
         *     }
         */

        //注册驱动
        //Driver driver =  (Driver) clazz.getDeclaredConstructor().newInstance();
        //DriverManager.registerDriver(driver);

        // 获取链接
        Connection connection  = DriverManager.getConnection(url,user,password);

        System.out.println(connection);
    }


    //jdbc的连接方式5
    public static void testConnect5() throws Exception {
        //1.获取
        InputStream is = Connect.class.getClassLoader().getResourceAsStream("jdbc/com/xiaotu/jdbc.properties");
        Properties properties = new Properties();
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");

        //2.加载Driver
        Class.forName(driverClass);

        //3.获取链接
        Connection connection  = DriverManager.getConnection(url,user,password);

        System.out.println(connection);
    }

}
