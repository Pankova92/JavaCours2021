package Homework;

public class Lesson17 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        return sb1.length() == sb2.length();
    }
}

class Lesson17Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Privet");
        //   StringBuilder sb2 = new StringBuilder("Privet");
        StringBuilder sb2 = sb1;
        boolean b = Lesson17.ravenstvo(sb1, sb2);
        System.out.println(sb1 == sb2);
    }
}