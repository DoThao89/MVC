package jdbcapp.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {

    public static Connection getSQLServerConnection() throws ClassNotFoundException, SQLException {
        String hostName ="localhost";
        String instanceName ="DESKTOP-LNLLKG4\\SQLEXPRESS02";
        String databaseName ="myjdbcapp";
        String userName ="sa";
        String password="sa";
        //Connection connection = getSQLServerConnection(hostName,instanceName,databaseName,userName,password);
        return getSQLServerConnection(hostName,instanceName,databaseName,userName,password);
    }
    public static Connection getSQLServerConnection(String hostName,
                                                    String instanceName,
                                                    String databaseName,
                                                    String userName,
                                                    String password) throws ClassNotFoundException, SQLException {

        //1. Load and register drive SQLServer
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = "jdbc:sqlserver://"+hostName+":1433"
                +";instance="+instanceName+";databaseName ="+databaseName;
       // String connectionString2 = "jdbc:sqlserver://localhost:1433;instance=.;databaseName =myjdbcapp";
        Connection connection = DriverManager.getConnection(connectionString,userName,password);
        return connection;
    }
}
