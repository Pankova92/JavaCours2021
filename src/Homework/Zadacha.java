package Homework;

public class Zadacha {

    static double umnojenie(int a,int b,int c){
        return a*b*c;
    }
    static void delenie(int a, int b){
        System.out.println("Целое частное = "+a/b+ ": "+"Остаток ="+a%b);
    }

}
class ZadachaTest{
    public static void main(String[] args) {
        System.out.println(Zadacha.umnojenie(2,5,3));
        Zadacha.delenie(7,2);
        System.out.println(Zadacha.umnojenie(3,5,8));
        Zadacha.delenie(47,4);


    }

}