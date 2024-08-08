package Lesson15.dz;

public class Clock {
    public static void main(String[] args) {

        int chas = 0;

        OUTER:
        while (chas < 6) {
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (chas == 1 && minuta%10 == 0) {
                    break OUTER;
                }
                int sec = 0;
                INNER:
                while (sec < 60) {
                    if (sec*chas > minuta + 1) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + sec);
                    sec++;
                }
            } while (minuta < 59);
            chas++;
        }
    }
}