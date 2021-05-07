package Homework;

import java.util.Arrays;

public class Lesson18 {
    public static void showArray(String[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.println(array[i][j]);
            }
        }

//        Arrays.asList(array).forEach(kolonka -> {
//            Arrays.asList(kolonka).forEach(stroka -> {
//                System.out.println(stroka);
//            });
//        });

    }

    public static void main(String[] args) {
        String[][] array = {{"privet", "drug"}, {"kak"}, {"tvoi", "dela"}};
        showArray(array);


    }
}
