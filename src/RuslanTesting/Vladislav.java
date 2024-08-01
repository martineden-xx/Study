package RuslanTesting;

public class Vladislav {
    private static String name;
    private int age;

    public Vladislav(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static void Pool(String name) {
        if (name.length() < 8) {
            System.out.println("Moe imya:" + name);
        } else {
            System.out.println("A ti loh");
        }
    }

    public static void main(String[] args) {
        Vladislav v1 = new Vladislav("Vladislav", 18);
        v1.Pool("Vlad");
        Vladislav.Pool("Vlad");
    }
}
