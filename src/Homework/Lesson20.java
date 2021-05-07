package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Lesson20 {
    public ArrayList<String> abc(String... s) {
        ArrayList<String> list = new ArrayList<>();

        // TODO проверить
        ArrayList<String> simple = (ArrayList<String>) Arrays.asList(s);

        for (String s1 : s) {
            if (!list.contains(s1)) {
                list.add(s1);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;


    }

    public static void main(String[] args) {
        Lesson20 L20 = new Lesson20();
        L20.abc("privet", "hello", "ok", "poka", "ok", "privet");
    }
}
