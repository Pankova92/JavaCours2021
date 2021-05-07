package Lesson19;

public class Test6 {
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println( " Минимальный элемент массива"+" "+min +"Максимальный элемент массива"+" "+max);

    }

    public static void main(String[] args) {
        double[] array1 = {1.05, -3.14, 8.0, 9.19, -3.0};
        maxMin(array1);
    }
}
