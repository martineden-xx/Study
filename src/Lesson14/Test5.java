package Lesson14;

public class Test5 {
    public void time (){
        OUTER:
        for (int chas = 0; chas<=5; chas++){
            INNER:
            for (int minute = 0; minute<=59; minute++){
                if (chas >= 1 && (minute == 11 || minute == 21 || minute == 31 || minute == 41 || minute == 51)){
                   break OUTER;
                }
                INNER2:
                for (int sec = 0; sec<=59; sec++ ) {
                    if ((chas*sec)> minute + 1)  {
                        continue INNER;}
                    System.out.println(chas + "  " + minute + "  " + sec);

                }

            }

        }
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.time ();
    }
}
