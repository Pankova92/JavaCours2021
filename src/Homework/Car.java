package Homework;

//Быстрая навигация до класс: Shift+Shift
public class Car {
    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {
    void changeDoors(Car c, int doors) {
        c.doors = doors;
    }

    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    // TODO почаще жать Ctrl+alt+L
    public static void main(String[] args) {
        CarTest cr = new CarTest();
        Car car1 = new Car("black", "V8", 4);
        Car car2 = new Car("red", "V6", 2);
        cr.changeColor(car1, car2);
        cr.changeDoors(car1, 2);
        System.out.println("Первая машина :" + " " + "цвет " + " " + car1.color + " " + "мотор" + " " + car1.engine + " " +
                "количество дверей" + " " + car1.doors);
        System.out.println("Вторая машина :" + " " + "цвет" + " " + car2.color + " " + "мотор" + " " + car2.engine + " " +
                "колтчество дверей" + " " + car2.doors);

    }
}
