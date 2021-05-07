package Homework;

public class Lesson19 {


    public static String[] abc(String[]... array) {
        int dlinaMassiva = 0;
        for (int index = 0; index < array.length; index++) {
            dlinaMassiva += array[index].length;
        }


        String[] result = new String[dlinaMassiva];
        int currentItem = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[currentItem] = array[i][j];
                currentItem++;
            }
        }

        return result;
    }

    // TODO:Написать тест
    public static void main(String[] args) {
        String[] currentItem = abc(new String[]{"privet", "poka"});
        System.out.println(currentItem);

    }
}

