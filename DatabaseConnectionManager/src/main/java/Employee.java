import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Employee {

    private int empNo;
    private String empName;
    private String job;
    private int mgr;
    private String hiredate;
    private double sal;
    private double comm;
    private int deptNo;

    //Konstruktør nr 1 er til at oprette et objekt i main
    public Employee(){

    }

//Konstruktør nr 2 er til input
    public Employee(int empNo, String empName, String job, int mgr, String hiredate, double sal, double comm, int deptNo) {
        this.empNo = empNo;
        this.empName = empName;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();

    HashMap<Integer,Employee> allEmpList = new HashMap();


    public HashMap<Integer, Employee> getAllEmployees(){

        try {
            //Get conncetion to database
            Connection myCon = connectionManager.createConnection();

            //create statement
            Statement myState = myCon.createStatement();

            //Query
            ResultSet getAllEmployees = myState.executeQuery("SELECT * from emp");

            while (getAllEmployees.next()){
                int empNo = getAllEmployees.getInt(1);
                String empName = getAllEmployees.getString(2);
                String job = getAllEmployees.getString(3);
                int mgr = getAllEmployees.getInt(4);
                String hiredate = getAllEmployees.getString(5);
                double sal = getAllEmployees.getDouble(6);
                double comm = getAllEmployees.getDouble(7);
                int deptNo = getAllEmployees.getInt(8);

                Employee employee = new Employee(empNo, empName, job, mgr, hiredate, sal, comm, deptNo);

                allEmpList.put(empNo,employee);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return allEmpList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate='" + hiredate + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptNo=" + deptNo +
                '}';
    }
}
