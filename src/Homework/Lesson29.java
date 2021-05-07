package Homework;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lesson29 {
}

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee(Employee e) {
        System.out.println("Имя работника " + e.name + " " + "департамент " + e.department + "зарплата заботника " + e.salary);
    }

    void filtraciyaRabotnikov(ArrayList<Employee> emp, Predicate<Employee> p) {
        for (Employee e : emp) {
            if (p.test(e)) {
                printEmployee(e);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("Ivan", "IT", 150);
        Employee e2 = new Employee("Nikolay", "Sales", 200);
        Employee e3 = new Employee("Petr", "IT", 300);
        Employee e4 = new Employee("Aleksandra", "Sales", 450);
        Employee e5 = new Employee("Elena", "IT", 400);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        TestEmployee t = new TestEmployee();
        t.filtraciyaRabotnikov(list, x -> x.department.equals("IT") && x.salary > 200);
        System.out.println("----------------------------------------------------------");
        t.filtraciyaRabotnikov(list, x -> x.name.startsWith("E") && x.salary != 450);
        System.out.println("----------------------------------------------------------");
        t.filtraciyaRabotnikov(list, x -> x.name.equals(x.department));


    }

}
