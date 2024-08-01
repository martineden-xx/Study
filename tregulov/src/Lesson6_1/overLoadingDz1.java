package Lesson6_1;

public class overLoadingDz1 {
    int sum(int a1, int a2) {
        return a1 + a2;
    }

    int sum(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }

    int sum(int a1, int a2, int a3, int a4) {
        return a1 + a2 + a3 + a4;
    }

    int sum(int a1, int a2, int a3, int a4, int a5) {
        return a1 + a2 + a3 + a4 + a5;
    }
}

class overLoadingDz1Test {
    public static void main(String[] args) {
        overLoadingDz1 m1 = new overLoadingDz1();
        int a = m1.sum(0, 1);
        System.out.println(a);

        int a1 = m1.sum(0, 1, 2);
        System.out.println(a1);

        int a2 = m1.sum(0, 1, 2, 3);
        System.out.println(a2);

        int a3 = m1.sum(0, 1, 2, 3, 4);
        System.out.println(a3);
    }
}