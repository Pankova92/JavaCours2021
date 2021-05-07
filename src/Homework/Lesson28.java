package Homework;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Lesson28 {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern(" yyyy ,MMMM-dd !! hh:mm ");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern(" hh:mm, dd/MMM/yy ");

    public void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
        LocalDateTime ldt;
        ldt = start;
        while (ldt.isBefore(end)) {
            System.out.println(" Работаем с : " + ldt.format(f1));
            ldt = ldt.plus(p);
            System.out.println(" До : " + ldt.format(f1));
            System.out.println(" Отдыхаем с : " + ldt.format(f2));
            ldt = ldt.plus(d);
            System.out.println(" До : " + ldt.format(f2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 31, 18, 0, 0);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(600);
        Lesson28 l28 = new Lesson28();
        l28.smena(ldt1, ldt2, p, d);
    }
}
