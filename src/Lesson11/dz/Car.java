package Lesson11.dz;

public class Car {
    String color;
    String engine;
    int countDoors;

    Car(String color, String engine, int countDoors) {
        this.color = color;
        this.engine = engine;
        this.countDoors = countDoors;
    }

    public int changeCountDoors(int countDoors) {
        this.countDoors = this.countDoors + 1;
        return this.countDoors;
    }

    public static void swap (Car cc1, Car cc2) {
        Car cc3 = cc1;
        cc1 = cc2;
        cc2 = cc3;
        System.out.println(cc1.color);
        System.out.println(cc2.color);
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "v6", 5);
        Car car2 = new Car("white", "v12", 3);
        swap (car1, car2);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V6", 3);
        Car c2 = new Car("black", "V2", 5);
        int d = c1.changeCountDoors(c1.countDoors);
        int d2 = c2.changeCountDoors(c2.countDoors);
        System.out.println(d);
        System.out.println(d2);

    }
}
