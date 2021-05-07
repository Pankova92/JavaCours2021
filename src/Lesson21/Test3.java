package Lesson21;

public class Test3 {
    Test3() {
        System.out.println("eto konstruktor");
    }

    void Test3() {
        System.out.println("sozdalsya obyekt");
    }
    int Test3 = 5;
}
     class A {
        public static void main(String[] args) {
            Test3 t = new Test3();
        }
    }

