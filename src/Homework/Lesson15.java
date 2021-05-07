package Homework;

public class Lesson15 {
   public static void vremya(){
        int chas = 0;
        OUTER:
        while (chas < 6){
            chas++;
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0)
                    break OUTER;
                int sekunda = 0;
                INNER:
                while (sekunda < 60 ){
                    if (sekunda * chas > minuta){
                        continue MIDDLE;
                    }
                    sekunda++;
                    System.out.println(chas +":"+ minuta+":"+ sekunda);

                }
            } while (minuta < 59);

        }
    }

    public static void main(String[] args) {
        vremya();

    }
}
