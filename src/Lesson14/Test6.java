package Lesson14;

public class Test6 {
    public void time() {

        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Nachalo outer loop");
            INNER:
            for (int minyta = 0; minyta <= 59; minyta++) {
                System.out.println(chas + ":" + minyta);
                if (minyta == 20) {
                    continue OUTER;
                }
            }
        }
        System.out.println("Konec outer loop");
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
