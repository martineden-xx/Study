package Lesson12.dz;
import Lesson12.dz.Student;

public class Student2 {
    }

class Student2test{
    public static void main(String[] args) {
        Student st1 = new Student("Vikto", 3);
        Student st2 = new Student("Viktor", 3);

        if (st1.name == st2.name && st1.course == st2.course) {
            System.out.println("Students are same");
        }
        else if (st1.name == st2.name && st1.course != st2.course) {
            System.out.println("Students has only same name");
            System.out.println("Students has different courses");;
        }
        else if (st1.name != st2.name && st1.course == st2.course) {
            System.out.println("Students has only same course");
            System.out.println("Students has different name");
        }
        else {
            System.out.println("Students are different");
        }
    }
}