package Lesson6_1;

public class methodOverLoading {
    void show(int a) {
        System.out.println(a);
    }

    void show (boolean b1) {
        System.out.println(b1);
    }

    void show (String s1){
        System.out.println(s1);
    }

    void show (String s, int i){
        System.out.println("Kak dela,zaebal? :" + s + " i: " + i);
    }

    void show (String s1, String s2){
        System.out.println("Kak dela,zaebal? " + s1+ "  To4no? " + s2);

    }
}

class methodOverLoadingTest {
    public static void main(String[] args) {
        methodOverLoading m0 = new methodOverLoading();
        int a = 1500;
        m0.show(a);
        boolean b1 = true;
        m0.show(b1);
        String s1 = "privet, dolboeb";
        m0.show(s1);
        m0.show ("normalno,zaebal", 15 );
        m0.show ("normalno zaebal", "da,zaebal");

    }
}