package Lesson5_dz3;

public class Lession4_dz {

    int Nomer_Stud_bileta;
    String First_Name;
    String Second_Name;
    int Course;
    double AVG_math;
    double AVG_economy;
    double AVG_english;
    String AVG_Ivanov;
    String AVG_Petrov;
    String AVG_Sidorov;


    public static void main(String[] args) {

        Lession4_dz Ivanov = new Lession4_dz();
        Lession4_dz Petrov = new Lession4_dz();
        Lession4_dz Sidorov = new Lession4_dz();

        Ivanov.Nomer_Stud_bileta = 7;
        Ivanov.First_Name = "Viktor";
        Ivanov.Second_Name = "Ivanov";
        Ivanov.Course = 1;
        Ivanov.AVG_math = 3;
        Ivanov.AVG_economy = 5;
        Ivanov.AVG_english = 4;
        Ivanov.AVG_Ivanov = "Ivanov";
        double AVG_Ivanov = (Ivanov.AVG_math + Ivanov.AVG_economy + Ivanov.AVG_english) / 3;


        Petrov.Nomer_Stud_bileta = 6;
        Petrov.First_Name = "Nikolay";
        Petrov.Second_Name = "Petrov";
        Petrov.Course = 1;
        Petrov.AVG_math = 4;
        Petrov.AVG_economy = 4;
        Petrov.AVG_english = 5;
        double AVG_Petrov = (Petrov.AVG_math + Petrov.AVG_economy + Petrov.AVG_english) / 3;


        Sidorov.Nomer_Stud_bileta = 28;
        Sidorov.First_Name = "Aleksandr";
        Sidorov.Second_Name = "Sidorov";
        Sidorov.Course = 1;
        Sidorov.AVG_math = 5;
        Sidorov.AVG_economy = 4;
        Sidorov.AVG_english = 5;
        double AVG_Sidorov = (Sidorov.AVG_math + Ivanov.AVG_economy + Sidorov.AVG_english) / 3;


    }

  public void showInfo() {
        System.out.println("Средняя оценка Сидоров:" + AVG_Sidorov);
        System.out.println("Средняя оценка Петров:" + AVG_Petrov);
        System.out.println("Средняя оценка Иванов:" + AVG_Ivanov);


    }

}

class Test {
    public static void main(String[] args) {
        Lession4_dz t1 = new Lession4_dz();
        t1.showInfo();
    }
}

