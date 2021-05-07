package Homework;

public class Lesson14 {
    public static void vremya() {
        OUTER:
        for (int chas = 0; chas < 6; chas++) {

            for (int minuta = 0; minuta < 60; minuta++) {

                INNER:
                for (int sekunda = 0; sekunda < 60; sekunda++) {
                    if (chas > 1 && minuta % 10 == 0) {
                        break OUTER;
                    }
                    if (sekunda * chas > minuta) continue INNER;
                    System.out.println(chas + ":" + minuta + ":" + sekunda);
                }
            }
        }
    }

    public static void main(String[] args) {
        vremya();
    }
}
