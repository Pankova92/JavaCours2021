package Homework;

public class Test2 {                            // ошибок компилятора нет
    int a=1;
    static int b=2;
    static void abc(final int a){
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}
