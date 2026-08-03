import java.util.Scanner;

public class Employee {
    int empId;
    String empName;
    double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println(empId + " " + empName + " " + salary);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int id1 = s.nextInt();
        String name1 = s.next();
        double sal1 = s.nextDouble();
        Employee e1 = new Employee(id1, name1, sal1);
        
        int id2 = s.nextInt();
        String name2 = s.next();
        double sal2 = s.nextDouble();
        Employee e2 = new Employee(id2, name2, sal2);
        
        e1.displayEmployee();
        e2.displayEmployee();
    }
}
