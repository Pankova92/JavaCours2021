package Lesson26;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        System.out.println(c1.equals(c2));
    }
}

class Car {
    String color;
    String enjine;

    Car(String color, String enjine) {
        this.color = color;
        this.enjine = enjine;
    }


    }
