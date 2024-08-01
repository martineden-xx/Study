package Lesson6_1;

public class constructorOverLoading {

    int id;
    String surname;
    int age;

    constructorOverLoading (int id2, String surname2, int age2){
        id = id2;
        surname = surname2;
        age = age2;
    }

    constructorOverLoading (String surname2, int age2){
        surname = surname2;
        age = age2;
    }
}

class constructorOverLoadingTest{
    public static void main(String[] args) {
        constructorOverLoading c1 = new constructorOverLoading("Petrov", 28);
        System.out.println(c1.surname);
        System.out.println(c1.surname + " " + c1.age);
        constructorOverLoading c2 = new constructorOverLoading(34, "Velikiy", 9);
        System.out.println(c2.surname + c2.id + " " + c2.age);
    }
}