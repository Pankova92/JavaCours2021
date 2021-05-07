package Lesson15;

public class Test9 {
    public static void main(String[] args) {
       OUTER:
       for(int chas = 0; chas < 24; chas++){
            int minuta = 0;
          INNER:
          while (minuta < 60){
              if (minuta == 20){
                  continue OUTER;
              }
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
        }
    }
}
