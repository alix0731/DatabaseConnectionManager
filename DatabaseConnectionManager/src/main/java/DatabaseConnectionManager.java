import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager{

    private String url;
    private String database;
    private String user;
    private String password;

    // Konstruktør
    public  DatabaseConnectionManager(){
        url = "jdbc:mysql://den1.mysql2.gear.host/";
        database = "jdbctest123";
        user = "jdbctest123";
        password = "Nd77w1X0V~p-";
    }


    public Connection createConnection() throws SQLException {
       return DriverManager.getConnection(url+database, user,password);

    }


}