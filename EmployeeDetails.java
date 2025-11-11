import java.util.Scanner;

class Employee {
    private double salary;
    private int hoursPerDay;

    public void getInfo(double salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursPerDay > 6) {
            salary += 5;
        }
    }

    public double getFinalSalary() {
        return salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter number of work hours per day: ");
        int hours = sc.nextInt();

        emp.getInfo(salary, hours);
        emp.addSal();
        emp.addWork();

        System.out.println("Final Salary: $" + emp.getFinalSalary());

        sc.close();
    }
}