package Lesson6_1;

public class Employee1 {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    Employee1(int id1, String surname1, int age1) {
        id = id1;
        surname = surname1;
        age = age1;
    }

    Employee1(int id2, String surname2, int age2, double salary2, String departament2) {
        this (id2, surname2, age2);
        salary = salary2;
        departament = departament2;
    }
}

class Employee1Test {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(28, "suchonok", 33, 28.500, "panel'");
        System.out.println(emp1.surname + " " + emp1.age + " " + emp1.salary + " " + emp1.departament);
    }
}