package Lesson13;

public class Student {
    private int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);

        switch (st1.grade) {
            case 2:
                System.out.println("huevo u4itsya");
                break;

            case 3:
                System.out.println("poydet dlya proebanca");
                break;

            case 4:
                System.out.println("nu voobwe krasav4ik");
                break;

            case 5:
                System.out.println("wl9pniy dolobeb");
                break;

            default:
                System.out.println("nu vashe hz, kak eto viwlo");
                break;

        }
    }
}


