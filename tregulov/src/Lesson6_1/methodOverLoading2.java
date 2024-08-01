package Lesson6_1;

public class methodOverLoading2 {
    int sum (int a, int b) {
        return a + b;
    }

    String sum(String a, String b) {
        return a + b;
    }
}

class methodOverLoading2Test {
    public static void main(String[] args) {
        methodOverLoading2 m2 = new methodOverLoading2();
        int d = m2.sum(7, 10);
        System.out.println(d);
        String s = m2.sum("kak dela?", "normalno, zaebal");
        System.out.println(s);
    }
}