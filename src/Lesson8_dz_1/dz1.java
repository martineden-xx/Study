package Lesson8_dz_1;

public class dz1 {
    int a;
    int b;
    int c;
    static int abc;
    static int def;

    public dz1(int a1, int b1, int c1) {
        a = a1;
        b = b1;
        c = c1;
        abc =a * b * c;
        def = a / b;
    }

    public static void showTrex() {
        System.out.println("Umnojenie Trex  " + abc);
    }
    public static void ShowDelenie (){
        System.out.println("Delenie a /b  " + def);
    }
    public static void main(String[] args) {
        dz1 Perviy = new dz1(10, 2, 5);
        dz1.showTrex();
        dz1.ShowDelenie();
    }
}
