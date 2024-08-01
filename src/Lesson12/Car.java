package Lesson12;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(8, 3);
        Car c2 = new Car(10, 7);

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("1-я машина лучше во всем");
            } else {
                System.out.println("У первой машины лучше только двигатель, а количество дверей меньше");
            }
        } else {
            System.out.println("Двигетель 1-ой машины хуже");
        }
    }
}

