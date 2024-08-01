package Lesson5_dz2;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    Employee(int id2, String surname2, int age2, double salary2, String departament2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        departament = departament2;
    }

    double uvelichenieZP() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTtest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(24, "suchonok", 48, 15000, "eskort");
        Employee emp2 = new Employee(33, "wlyxa", 24, 18500, "scum");

        emp1.uvelichenieZP();
        System.out.println("NEW ZP uebka: " + emp1.surname + " " + emp1.salary);

        emp2.uvelichenieZP();
        System.out.println("NEW ZP uebka2: " + emp2.surname + " " + emp2.salary);
    }
}