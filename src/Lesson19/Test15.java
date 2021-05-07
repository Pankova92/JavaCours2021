package Lesson19;

public class Test15 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"matAnaliz", "filosofiya"};
        for (String s1 : students) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
