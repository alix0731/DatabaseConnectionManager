import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> listNum = new HashMap<Integer, String>();

        listNum.put(1, "one");

        listNum.put(2,"two");
        listNum.put(3,"three");

        System.out.println(listNum.get(1));


        /*
        Employee employee = new Employee();


        for(int i : employee.getAllEmployees().keySet()){
            System.out.println(employee.getAllEmployees().get(i));
        }

         */

/*
        try {
            DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();

            Connection myCon = databaseConnectionManager.createConnection();

            //Create statement
            Statement statement = myCon.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM emp");

            ResultSetMetaData metaData = rs.getMetaData();

            System.out.println(metaData.getColumnName(1));

            while (rs.next()){
                System.out.println(rs.getInt(1));
            }
        }catch (SQLException e){
            System.out.println(e.getErrorCode());
            System.out.println(e.getSQLState());
        }

 */

    }
}
