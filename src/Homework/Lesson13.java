package Homework;

public class Lesson13 {
                            // TODOне ставить модификатор статик без надобности
    static class Month {
        public static void calendar2015(int n) {
            //обязательно ставить`break`
            switch (n) {
                case 2 -> System.out.println(" В месяце 28 дней");
                case 4, 6, 9, 11 -> System.out.println(" В месяце 30 дней");
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(" В месяце 31 день");
                default -> System.out.println(" Такого месяца нет");
            }
        }

        public static void main(String[] args) {

            Month.calendar2015(3);
            Month.calendar2015(8);
            Month.calendar2015(4);
            Month.calendar2015(2);
            Month.calendar2015(15);

        }
     }
    }