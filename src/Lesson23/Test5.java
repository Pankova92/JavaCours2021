package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Teacher t = new Teacher();
        Employee e = new Teacher();
        e.sleep();
    }

}

class Eda {
}

class Frukti extends Eda {
}

class Employee {

    double salary = 100;
    String name = "Kolya";

    public Eda eat() {

        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher extends Employee {
    public Eda eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

   public void uchit() {
        System.out.println("uchit");
    }

    public void sleep() {
        System.out.println("Spit");
    }

}
