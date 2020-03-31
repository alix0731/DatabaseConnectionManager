import java.sql.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {



        Employee employee = new Employee();


        for(Integer x: employee.getAllEmployees().keySet()){
            System.out.println(employee.getAllEmployees().get(x));
        }




        Department department = new Department();
        System.out.println(department.getSetOfDepartments());



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
