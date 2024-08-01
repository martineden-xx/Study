package LessonTen;

import Lesson10.A;
import Lesson10.staticMode.Third.C;
import LessonTen.New.E;

public class D {
    public static void main(String[] args) {
        A t1 = new A("SU4onok", "Ivanov", 32, 1000.50, "Mr");
        System.out.println(t1.name + "  " + t1.bankAccount);

        C t2 = new C("Viktor", "Ivanov", 32, "MR");
        System.out.println(t2.name + "  " + t2.surname + "  " + t2.age + "  " + t2.status);

        E t3 = new E ("Viktor", "Petrov");
        System.out.println(t3.name + "  " + t3.surname);
    }

}

