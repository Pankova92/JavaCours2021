package Homework;

public class Zadacha2 {
    public static final double Pi= 3.14;

    public double ploshadK(double radius){

        return Pi*radius*radius;

    }
    public static double dlina (double radius){

        return 2*Pi*radius;

    }

    public void info(double radius, double dlina){
        System.out.println("Radius = "+radius);
        System.out.println("Ploshad kruga = "+ploshadK(radius));
        System.out.println( "Dlina ="+dlina);

    }
}

class Zadacha2Test{
    public static void main(String[] args) {
        Zadacha2 z=new Zadacha2();
        z.ploshadK(3);
        double dlina = Zadacha2.dlina(8);
        z.info(4,dlina);

    }
}
