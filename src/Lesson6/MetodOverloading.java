package Lesson6;

public class MetodOverloading {
    void show(int i1){
    System.out.println(i1);
    System.out.println("Data Type is int");
    }
    void show(int a,int b){
    System.out.println(a);
    System.out.println("Data Type is int");
    }
    void show(boolean b1){
    System.out.println(b1);
    System.out.println("Data Type is boolean");
    }
    void show(String s1){
    System.out.println(s1);
    System.out.println("Data Type is String");
    }
    void show(String s, int a){
    System.out.println("String :"+" "+ s+"int"+a);
    System.out.println("Privet" +" " +" "+ "int"+10);
    }
    void show(int a, String s) {
    System.out.println("Kakoi xoroshii den");
    }
}
class MetodOverloadingTest{
    public static void main(String[] args) {
        MetodOverloading mO=new MetodOverloading();
        int i=231;
        mO.show(i);
        boolean b=true;
        mO.show(b);
        String s=("Privet");
        mO.show(s);
        mO.show("Privet", 10);
        mO.show(10,"Privet");
    }
}