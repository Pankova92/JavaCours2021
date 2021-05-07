package Lesson12;

public class Car {
    int enjine;
    int doorCount;
    Car(int enjine, int doorCount){
        this.enjine = enjine;
        this.doorCount = doorCount;
    }
}
class  CarTest{
    public static void main(String[] args) {
        Car c1 = new Car(3,4);
        Car c2 = new Car(2,5);
        if (c1.enjine > c2.enjine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("Moshnost motora i kolicgestvo dverei y pervoi mashiny bolshe");
            } else {
                System.out.println("Moshnost motora  i pervoi mashiny bolshe, a kolicgestvo dverei menshe ");
            }
        }
        else {
        System.out.println("Moshnost motora  i pervoi mashiny menshe ");}


    }
}
