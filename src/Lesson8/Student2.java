package Lesson8;

public class Student2 {
    String name;
    int course;
    static int count;

    public Student2(String name2, int course2) {
        name = name2;
        course = course2;
        count++;
    }

    public static void showCount(){
        System.out.println("Vsego sozdano studentov  " + count);
    }

    public static void main(String[] args) {
        Student2 st1 = new Student2("Jan", 1);
        Student2 st2 = new Student2("kell", 2);
        Student2 st3 = new Student2("Mike", 3); 
        Student2 st4 = new Student2("Khabib", 4);
        Student2 st5 = new Student2("Mia Khalifa", 5);
        Student2 st6 = new Student2("Lobanov", 3);

        Student2.showCount();
    }
}
