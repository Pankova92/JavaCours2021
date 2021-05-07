package Lesson8;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name,int course){
        count++;
        this.name=name;
        this.course=course;
        System.out.println("Student № "+count+" "+"sozdan");


    }
    public static void showCount(){
        System.out.println("Vsego sozdanno studentov :"+" "+ count);
    }

    public static void main(String[] args) {

    }
}







