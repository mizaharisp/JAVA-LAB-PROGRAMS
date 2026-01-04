import java.util.Scanner;

class Employee {
    String Name;
    int age;
    String phonenumber;
    String address;
    double salary;
    
    void printSalary() {
        System.out.println("Salary: Rs" + salary);
    }
}

class Officer extends Employee {
    String specialization;

    public Officer(String Name, int age, String phonenumber, String address, double salary, String specialization) {
        this.Name = Name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phonenumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String Name, int age, String phonenumber, String address, double salary, String department) {
        this.Name = Name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phonenumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Officer:");
        System.out.print("Name: ");
        String officerName = scanner.nextLine();
        System.out.print("Age: ");
        int officerAge = scanner.nextInt();
        scanner.nextLine();  // consume newline left-over
        System.out.print("Phone Number: ");
        String officerPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String officerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double officerSalary = scanner.nextDouble();
        scanner.nextLine();  // consume newline left-over
        System.out.print("Specialization: ");
        String officerSpecialization = scanner.nextLine();

        Officer officer = new Officer(officerName, officerAge, officerPhoneNumber, officerAddress, officerSalary, officerSpecialization);

        System.out.println("Enter details for Manager:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Age: ");
        int managerAge = scanner.nextInt();
        scanner.nextLine();  // consume newline left-over
        System.out.print("Phone Number: ");
        String managerPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine();  // consume newline left-over
        System.out.print("Department: ");
        String managerDepartment = scanner.nextLine();

        Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary, managerDepartment);

        System.out.println("\nOfficer Details:");
        officer.displayDetails();

        System.out.println("\nManager Details:");
        manager.displayDetails();

        scanner.close();
    }
}
