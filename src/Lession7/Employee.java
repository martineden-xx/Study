package Lession7;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public Employee(int id1, String surname1, double salary1) {
        id = id1;
        surname = surname1;
        salary = salary1;
    }

    public Employee (String surname2, double salary2){
        this (0, surname2, salary2);
    }

    public Employee (double salary3){
        this (0, "null", salary3);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(28, "Petrov", 500.5);
        System.out.println(emp.surname + " " + emp.id);
    }
}