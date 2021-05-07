package Homework;

import Lesson11.Student;


public class StudentTest {

    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты разные ");
        }
    }

    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена , курс и оценки студентов одинаковые");
                } else {
                    System.out.println("Имена и курсы одинаковые , оценки различаются");
                }
            } else {
                System.out.println("Имена одинаковые , курсы разные");
            }
        } else {
            System.out.println("Имена студентов разные");
        }

    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 2, 9.5);
        Student s2 = new Student("Petr", 2, 9.5);
        method1(s1, s2);
        method2(s1, s2);
    }
}








