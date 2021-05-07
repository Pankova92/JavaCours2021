package Lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test1 {
    public static void main(String[] args) {
        //  System.out.println(LocalDate.now());
        //  System.out.println(LocalTime.now());
        //  System.out.println(LocalDateTime.now());

        LocalDate ld1 = LocalDate.of(2014, 05, 15);
        System.out.println(ld1);
      //  LocalDate ld2 = LocalDate.of(2014, Month.MAY, 15);
      //  System.out.println(ld2);
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);
      //  LocalTime lt2 = LocalTime.of(15, 30, 45);
      //  System.out.println(lt2);
      //  LocalTime lt3 = LocalTime.of(15, 30, 45, 999999999);
      //  System.out.println(lt3);
        LocalDateTime ldt1 = LocalDateTime.of(2015, 9, 10, 17, 25);
        System.out.println(ldt1);
      //  LocalDateTime ldt2 = LocalDateTime.of(2015, 9, 10, 17, 25, 18);
      //  System.out.println(ldt2);
      //  LocalDateTime ldt3 = LocalDateTime.of(2015, 9, 10, 17, 25, 18, 999);
      //  System.out.println(ldt3);
        ld1 = ld1.plusDays(5);
        System.out.println(ld1);
        ld1 = ld1.minusDays(5);
        ld1 = ld1.plusMonths(2);
        ld1 = ld1.minusMonths(3);


    }

}
