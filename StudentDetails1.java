import java.util.Scanner;

class Student {
    String name;
    int yearOfJoining;
    String address;
    double salary;

    public void setInfo(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void displayInfo() {
        System.out.printf("%-10s %-15d %-20s\n", name, yearOfJoining, address);
    }
}

public class StudentDetails1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student(); 

            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Year of Joining: ");
            int year = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 

            System.out.print("Address: ");
            String address = sc.nextLine();

            students[i].setInfo(name, year, salary, address);
        }

        System.out.println("\nName       Year of Joining   Address");
        for (Student s : students) {
            s.displayInfo();
        }

        sc.close();
    }
}
