import java.sql.*;

public class demo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pratice";
        String username ="root";
        String userpassword = "root";
        String sql ="select firstname,lastname from cyient where id = 1";
        Connection con = DriverManager.getConnection(url,username,userpassword);
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery(sql);
     rs.next();
     String name = rs.getString(1);
     System.out.println(name);

    }
}
