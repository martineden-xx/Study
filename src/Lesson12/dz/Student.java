package Lesson12.dz;

import java.sql.SQLOutput;

public class Student {
    public String name;
    public int course;
    public double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    Student (String name, int course) {
        this.name = name;
        this.course = course;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Viktor", 2, 5);
        Student st2 = new Student("Viktor", 3, 9);

        if (st1.name == st2.name) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Students are same");
                } else {
                    System.out.println("Students has only the same name and course");
                }
            } else {
                System.out.println("Students has only same name");
            }

        } else {
            System.out.println("Students are different");
        }
    }
}