package Lesson16;

import java.util.Locale;

public class Test5 {
    public static void main(String[] args) {
        String s = "PRIVET:2!";
        String s2 = s.toLowerCase(Locale.ROOT);
        System.out.println(s2);

        String s3 = "privet";
        String s4 = s3.toUpperCase(Locale.ROOT);
        System.out.println(s4);

        boolean b = s.contains(":2");
        System.out.println(b);



    }
}
