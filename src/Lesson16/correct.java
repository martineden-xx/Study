package Lesson16;

public class correct {
    public void correct (String s){
        int a = 0; // позиция символа @
        int b = 0; // позиция символа .
        int c = 0; // позиция символа ;

        while (c<s.length() - 1){
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a+1, b)); // метод работает следующим образом: в интересуюзщих нас почтовых адресах задаем начало отчета с @. И сокращем его до . Последняя строчка цикла с + 1 показывает, что после первого слова мы переходим во второе и тд. Пока Длина всей строчки, которую мы циклим, не дойдет до конца.
        }
    }

    public static void main(String[] args) {
        correct c1 = new correct();
        c1.correct("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}

