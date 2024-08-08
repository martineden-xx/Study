package Lesson15;

public class Test6 {
    public static void main(String[] args) {

        int money = 100;

        do {
            System.out.println("Delayte stavku");
            System.out.println("vi proigrali");
            money = money - 10;
            System.out.println("Vash tekushiy balance: " + money);
        }

        while (money > 30);
    }
}
