package p4;

import p1.A;
import p1.p2.B;
import p1.p2.p3.C;
import p4.p5.E;

public class D {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.s1);

        B b = new B();
        b.showBoolean();

        C c = new C();
        c.showAdc();

        E e = new E();
        System.out.println(e.x);
    }
}
