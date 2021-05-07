package Lesson13;

public class Test2 {

}
class Student2 {
    int grade;

    Student2(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args){
        Student2 st1 = new Student2(1);
        switch (st1.grade){
            case 2:
                System.out.println("Student dvoechnik");
                break;
            case 3:
                System.out.println("Student troechnik");
                break;
            case 4:
                System.out.println("Student horoshist");
                break;
            case 5:
                System.out.println("Student otlichnik");
                break;
            default:
                System.out.println("Ocenka neverna");





        }


    }
}
