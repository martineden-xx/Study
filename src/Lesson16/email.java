package Lesson16;

import java.util.Locale;

public class email {
    public static void main(String[] args) {
        String m1 = new String("ti@yahoo.com; on@mail.ru; ego@gmail.com;");
        String m2 = m1.toLowerCase().replace("ti@", "fuc").replace("on@", "srf").replace("ego@", "fuck").replace("com", "234").replace("ru", "23");

        char c1;
        char c2;

        for (int i = 0; i < m1.length(); i++) {
            c1 = m1.charAt(i);
            c2 = m2.charAt(i);

            if (c1 == c2 && c1 != '.' && c1 != ';') {
                System.out.print(c1);
                continue;
                }
            }
        }
    }
