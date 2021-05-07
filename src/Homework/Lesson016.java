package Homework;

public class Lesson016 {
    public void Email(String s){
        int sobaka = 0;
        int tochka = 0;
        int tochkaSZapyatoi = 0;

        while (tochkaSZapyatoi < s.length() - 1){
            sobaka = s.indexOf('@', tochkaSZapyatoi);
            tochka = s.indexOf('.', tochkaSZapyatoi);
            tochkaSZapyatoi = s.indexOf(';',tochkaSZapyatoi + 1);
            System.out.println(s.substring( sobaka + 1 , tochka));

        }
    }

    public static void main(String[] args) {
        Lesson016 l16 = new Lesson016();
        l16.Email("ya@yahoo.com;   on@mail.ru;  ona@gmail.com;");
    }
}
