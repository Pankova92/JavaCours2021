package Lesson20;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student st = new Student();
        list.add(st);
        list.add(new StringBuilder("ok"));
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("poka");
        ArrayList < String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5);
        ArrayList<StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("ok"));

    }
}

class Car {
}

class Student {
}