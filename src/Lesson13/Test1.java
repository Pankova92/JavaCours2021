package Lesson13;

public class Test1 {

}
class Student {
    double grade;

    Student(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st = new Student(3);
        if (st.grade == 2) {
            System.out.println("Student dvoechnik");
        } else if (st.grade == 3) {
            System.out.println("Student troechnik");
        } else if (st.grade == 4) {
            System.out.println("Student xoroshist");
        } else if (st.grade == 5) {
            System.out.println("Student otlichnik");
        } else {
            System.out.println("Ocenka nevernaya");
        }



    }
    }
