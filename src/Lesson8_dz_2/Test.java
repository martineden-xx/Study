package Lesson8_dz_2;

public class Test {
    static int R;
    final double Pi = 3.14;
    static double S;
    static double L;

    public Test (int R1, double Pi1) {
        R = R1;
        Pi1 = Pi;
        S = Pi*R*R;
        L = 2 * Pi * R;
    }
    public static void showSS(){
        System.out.println("Площадь круга равна: " + S);
    }

    public static void showLL (){
        System.out.println(("Длина окружности равна: " + L));
    }

    public static void showParam(){
        System.out.println("Радиус окружности равен: " + R + "  Площадь окружности: " + S + "  Длина окружности: " + L);
    }

    public static void main(String[] args) {
        Test t1 = new Test(3, 2.5);
        Test.showSS();
        Test.showLL();
        Test.showParam();
    }
}
