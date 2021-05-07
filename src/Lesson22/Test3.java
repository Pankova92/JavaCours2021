package Lesson22;

public class Test3 {
    void uvelichZp(Employee e) {
        e.salary = e.salary + 100;
    }

    public static void main(String[] args) {
        Doktor doc = new Doktor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.exsperience = 25;
        doc.specializaciya = "xirurg";
        doc.eat();
        doc.sleep();

    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int exsperience;
    String specializaciya;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }

}

class Doktor extends Employee {

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {

    void vozit() {
        System.out.println("Vozit");
    }
}