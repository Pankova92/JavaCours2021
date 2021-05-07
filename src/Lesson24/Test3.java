package Lesson24;

public class Test3 {
    public static void main(String[] args) {

    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int exspiriance;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee implements Help_adle {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    @Override
    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }
}

class Driver extends Employee implements Help_adle, swim_adle {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }

    @Override
    public void pomosh() {
        System.out.println("Voditel  okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println(" Voditel tushit pojar");
    }

    public void swim_adle() {
        System.out.println("Voditel umeet plavat");
    }

    @Override
    public void swim() {

    }
}

interface Help_adle {
    void pomosh();

    void tushitPojar();
}

interface swim_adle {
    void swim();
}