import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager{

    private String url;
    private String database;
    private String user;
    private String password;

    // Konstruktør
    public  DatabaseConnectionManager(){
        url = "jdbc:mysql://den1.mysql2.gear.host/";
        database = "jdbctest123";
        user = getUserProperty();
        password = getPasswordProperty();
    }



    public Connection createConnection() throws SQLException {
       return DriverManager.getConnection(url+database, user,password);


    }

    public String getUserProperty(){

        Properties property = null;
        InputStream input = null;

        try {
            property = new Properties();

            input = new FileInputStream(new File("/Users/alirazaakhtar/Dokumenter/Programmering/2.semester/Konstruktion/DatabaseConnectionManagerGit/DatabaseConnectionManager/src/main/resources/application.properties"));

            property.load(input);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return property.getProperty("db.user");
    }

    public String getPasswordProperty(){

        Properties property = null;
        InputStream input = null;

        try {
            property = new Properties();

            input = new FileInputStream(new File("/Users/alirazaakhtar/Dokumenter/Programmering/2.semester/Konstruktion/DatabaseConnectionManagerGit/DatabaseConnectionManager/src/main/resources/application.properties"));

            property.load(input);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return property.getProperty("db.password");
    }



}