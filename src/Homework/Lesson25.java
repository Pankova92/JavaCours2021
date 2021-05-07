package Homework;

public class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Mech1");
        Animal a2 = new Pingvin("Kovalski1");
        Animal a3 = new Lev("Yasha1");
        Fish f1 = new Mechenosec("Mech2");
        Bird b1 = new Pingvin("Kovalski2");
        Mammal mam1 = new Lev("Yasha2");
        Mechenosec m1 = new Mechenosec("Mech3");
        Pingvin p1 = new Pingvin("Kovalski3");
        Lev l1 = new Lev("Yasha3");
        Speakable sp1 = new Pingvin("Kovalski4");
        Speakable sp2 = new Lev("Yasha4");

        Animal[] array1 = {a1, a2, a3, f1, b1, mam1, m1, p1, l1};
        Speakable[] array2 = {sp1, sp2, b1, mam1, p1, l1};
        for (Animal a : array1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.sleep();
                m.eat();
                m.swim();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.fly();
                p.eat();
                p.sleep();
                p.speak();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.speak();
                l.sleep();
                l.run();
            }
            System.out.println();
            System.out.println();
        }
        for (Speakable s : array2) {
            if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.speak();
                p.sleep();
                p.eat();
                p.fly();
            } else if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.run();
                l.speak();
                l.sleep();
                l.eat();
            }
            System.out.println();
            System.out.println();
        }
    }
}

abstract class Animal {
    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
    }

    public void sleep() {
        System.out.println("Vsegda interesno nablyudat , kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + "sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i est obichnii ribii korm");
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");

    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Pingvin lyubit est riby");
    }

    @Override
    void sleep() {
        System.out.println("Pindvini spyat prijimayas drug k drudu");
    }

    @Override
    void fly() {
        System.out.println("Pingvini ne ymeut letat");
    }

    public void speak() {
        System.out.println("Pingvini ne ymeut pet kak solovyi ");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lev kak lyuboi xichnik , lyubit myaso.");

    }

    @Override
    void sleep() {
        System.out.println("Bolshyu chast dnya lev spit");
    }

    @Override
    void run() {
        System.out.println("Lev eto ne samaya bistraya koshka!");
    }
}