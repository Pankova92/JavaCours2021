package Lesson6;

public class Summirovanie {
    int sum() {
        int result = 0;
        System.out.println(result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Summa vseh chisel" + " " + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Summa vseh chisel" + " " + result2);
        return result2;
    }

    int sum(int x, int y, int z) {
        int result3 = x + y + z;
        System.out.println("Summa vseh chisel" + " " + result3);
        return result3;
    }

    int sum(int j, int f, int i, int g) {
        int result4 = j + f + i + g;
        System.out.println("Summa vseh chisel" + " " + result4);
        return result4;
    }
}
class SummirovanieTest{
    public static void main(String[] args) {
     Summirovanie s=new Summirovanie();
     s.sum();
     s.sum(7);
     s.sum(9,6);
     s.sum(15,89,63);
     s.sum(21,76,45,3);

    }
}

