package Lesson23;

public class A10 {
    String s1 = "privet";
    static double d1 = 3.14;

    int summa(int... i) {
        int rezult = 0;
        for (int a : i) {
            rezult += a;
        }
        return rezult;
    }

    static void abc() {
        System.out.println("Static method");
    }
}
class B10 extends A10{
    String s2 = super.s1+ ",drug";

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s2);
    }
}