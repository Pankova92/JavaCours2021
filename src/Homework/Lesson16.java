package Homework;

public class Lesson16 {

    public void email(String s) {
        int sobaka = 0; // Shift+F6
        int tochka = 0;
        int tochkaSZapyatoi = 0;


        while (tochkaSZapyatoi < s.length() - 1) {
            sobaka = s.indexOf('@', tochkaSZapyatoi);
            tochka = s.indexOf('.', tochkaSZapyatoi);
            tochkaSZapyatoi = s.indexOf(';', tochkaSZapyatoi + 1);
            System.out.println(s.substring(sobaka + 1, tochka));
        }

    }

    public static void main(String[] args) {
        Lesson16 lesson16 = new Lesson16();
        lesson16.email("redtom@yandex.ru; tatyana@google.com;");
    }
}
