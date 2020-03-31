import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class Department {

    private int deptno;
    private String dname;
    private String loc;

    public Department(){

    }

    public Department(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
    private HashSet<Department> deptObj = new HashSet<Department>();


    public HashSet<Department> getSetOfDepartments(){


        try {
            Connection myCon = connectionManager.createConnection();

            Statement myState = myCon.createStatement();

            ResultSet myResult = myState.executeQuery("SELECT  * FROM dept order by deptno");

            while (myResult.next()){
                deptno = myResult.getInt(1);
                dname = myResult.getString(2);
                loc = myResult.getString(3);


                deptObj.add(new Department(deptno, dname, loc));


            }

        }
        catch (SQLException e){
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }

        return deptObj;

    }

    @Override
    public String toString() {
        return "\nDepartment{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
