package Lesson9;

public class Car {
    final int XYZ = 3;
    String color;
    public static int a=10;
    String engine;
   public static int count;

    public static void chageA(int b){
     Car c = new Car("black" ,"V8");
     c.a=b;

    }

    public Car(String color, String engine){
        count++;
        this.color=color;
        this.engine=engine;
    }

    public void showColor(){
        System.out.println("Цвет мфшины  "+ color);
        this.changeColor("red");
    }
    public void changeColor(String color){
        System.out.println("Цвет машины изменился ");
        int cena=5000;
        this.color=color;
        cena+=1000;
    }
}
