package Lesson12;

public class Maximum {

    void max(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("max" + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("max" + i2);
        } else {
            System.out.println("max" + i3);
        }
    }

    public static void main(String[] args) {
        Maximum m = new Maximum();
        m.max(0,5,2);
    }
}
