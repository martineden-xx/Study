package Lesson6_1;

public class newOperatorThis {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    newOperatorThis(int id1, String surname1, int age1, double salary1, String departament1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        departament = departament1;
    }

    newOperatorThis(int id2, String surname2, int age2) {
        this (id2, surname2, age2, 0.0, "");
    }

    newOperatorThis (double salary3, String departament3) {
        this (0, null, 0, salary3, departament3);
    }
}

class newOperatorThisTest {
    public static void main(String[] args) {
        newOperatorThis n1 = new newOperatorThis(28, "Ivanov", 32, 500.20, "bardel");
        System.out.println(n1.surname + " " + n1.age + " " + n1.departament + " " + n1.salary);

        newOperatorThis n2 = new newOperatorThis (28,"Petrova", 32);
        System.out.println(n2. surname + " " + n2.age);

        newOperatorThis n3 = new newOperatorThis (400.2, "devo4ka pay");
        System.out.println(n3.departament + " " + n3.age);
    }
}