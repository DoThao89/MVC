package jdbcapp.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLServerConnection {
    public  static Connection getSQLServerConnection() throws SQLException, ClassNotFoundException, SQLException {
        String hostname="localhost";
        String database="myjdbcapp";
        String username="root";
        String password="";
        return  getSQLServerConnection(hostname,database,username,password);
    }
    public  static Connection getSQLServerConnection(
            String hostname
            ,String databasename
            ,String username
            ,String password) throws ClassNotFoundException, SQLException {

        //1.load and register driver sqlserver
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionString="jdbc:mysql://"+hostname+":3306"+
                ";database="+databasename;
        Connection connection= DriverManager.getConnection(connectionString,username,password);
        return connection ;
    }

}