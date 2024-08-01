package Lesson8;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name2, int course2) {
        count++;
        this.name = name2;
        this.course = course2;

        System.out.println("Student  " + count + "  sozdan");
    }
}

class HumanTest{
    public static void main(String[] args) {
        Student s1 = new Student("Tvar'", 1);
        Student s2 = new Student("Ivan", 2);
        Student s3 = new Student("Petr", 3);
    }
}