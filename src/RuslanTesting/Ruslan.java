package RuslanTesting;

public class Ruslan {
    private String name;
    private int age;
    private static double Pi = 3.14;

    public Ruslan (String name, int age, double Pi2) {
        this.name = name;
        this.age = age;
        Pi2 = Pi;
    }

    public String getName() {
        return name;
    }

    public static double getPi() {
        return Pi;
    }
}
