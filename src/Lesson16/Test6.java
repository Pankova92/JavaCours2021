package Lesson16;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Uraaaaaaa!!!";
        String s3 = s1.concat(s2).trim().replace("Uraaaaaaa", "УРА").substring(6,10);// metod chaining
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
