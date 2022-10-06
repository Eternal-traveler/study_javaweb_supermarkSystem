import com.haoyang.dao.BaseDao;
import com.haoyang.pojo.User;

import java.sql.*;

/**
 * @author 28443
 * @version 1.0
 * @date 2022/6/13 16:05
 */
public class testconnect {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动类
        String url="jdbc:mysql://localhost:3306/look?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
        String username="root";
        String password="2003";
        Connection conn= DriverManager.getConnection(url,username,password);//用参数得到连接对象
        System.out.println("连接成功！");
        System.out.println(conn);
    }
}
