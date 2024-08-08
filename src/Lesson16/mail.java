package Lesson16;

public class mail {
    public static void main(String[] args) {
        String mail = new String ("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

        String s1 = mail.substring(3,8);
        System.out.println(s1);

        String s2 = mail.substring(17,21);
        System.out.println(s2);

        String s3 = mail.substring(30,35);
        System.out.println(s3);
    }
}
