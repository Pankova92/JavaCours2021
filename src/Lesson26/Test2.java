package Lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
     //   System.out.println(a);
        Integer b = new Integer(10);
        int c = b;
        switch (b){}
        String s1 = "50";
        String s2 = "true";
        int i1 = Integer.parseInt(s1);
        Boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(i1);
    }
}
