//package StudentTest;
//
//import Lesson5_dz3.Lession4_dz;
//
//public class Student {
//
//    int Nomer_Stud_bileta;
//    String First_Name;
//    String Second_Name;
//    int Course;
//    double AVG_math;
//    double AVG_economy;
//    double AVG_english;
//
//    public Student(String First_Name, String Second_Name) {
//        this.First_Name = First_Name;
//        this.Second_Name = Second_Name;
//    }
//
//    public Student(String name, String lastname, int course, double math, double economy, double english) {
//        this.First_Name = name;
//        this.Second_Name = lastname;
//        this.Course = course;
//        this.AVG_math = math;
//        this.AVG_economy = economy;
//        this.AVG_english = english;
//    }
//
//    public Student() {
//    }
//
//    public double getAVGCourse(Student student) {
//        double result = (student.AVG_economy + student.AVG_english + student.AVG_math) / 3;
//        System.out.println("Средняя оценка студента по предметам равна: " + result);
//        return result;
//    }
//
//    void showInfo(StudentTest.Student s1) {
//    }
//}
//
//class StudentTest {
//    public static void main(String[] args) {
//
//        Student s1 = new Student();
//        s1.showInfo(s1);
//        Lession4_dz l = new Lession4_dz();
//        l.showInfo();
//
//        Student s2 = new Student("Ruslan", "Samatov");
//        Student s3 = new Student("VLadislav", "Kim", 4, 4.4, 4, 3.2);
//        Student s4 = new Student("Viktor", "Samatov", 4, 9.2, 6.1, 9, 2);
//
//        s3.getAVGCourse(s3);
//        System.out.println(s3.Second_Name);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s4);
//
//
//    }
//}
