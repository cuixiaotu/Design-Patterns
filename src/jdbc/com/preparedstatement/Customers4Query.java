package jdbc.com.preparedstatement;

import jdbc.com.bean.Customer;
import jdbc.com.connection.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Customers4Query {


    public void queryForCustomers(String sql,Object ...args) throws Exception {
        Connection conn = JDBCUtils.getConnection();

        PreparedStatement ps = conn.prepareStatement(sql);

        for (int i=0;i<args.length;i++){
            ps.setObject(i+1,args[i]);
        }

        ResultSet res= ps.executeQuery();

    }


    @Test
    public void testQuery1(){

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from customers where id = ?";
            ps = conn.prepareStatement(sql);

            ps.setInt(1,19);
            rs = ps.executeQuery();
            if (rs.next()){

                int id = rs.getInt(1);
                String name =  rs.getString(2);
                String email = rs.getString(3);
                Date birth = rs.getDate(4);

                //1
                // System.out.println("id : "+ id+ ",name:"+name+",email:"+email+",birth:"+birth);
                //2
                // Object[] data = new Object[]{id,name,email,birth};
                // System.out.println(data[1]);
                //3.
                Customer customer = new Customer(id,name,email,birth);
                System.out.println(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }

    }
}
