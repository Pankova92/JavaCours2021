public class Student {


    int studentid;
    String name;
    String surname;
    int cours;
    double matchAverageCrade;
    double economicsAvaregeCrade;
    double foreinghLanguageAvaregeCrade;


    Student(int studentid,
            String name,
            String surname,
            int course,
            double matchAverageCrade,
            double economicsAvaregeCrade,
            double foreinghLanguageAvaregeCrade) {

        this.studentid = studentid;
        this.name = name;
        this.surname = surname;
        this.cours = course;
        this.matchAverageCrade = matchAverageCrade;
        this.economicsAvaregeCrade = economicsAvaregeCrade;
        this.foreinghLanguageAvaregeCrade = foreinghLanguageAvaregeCrade;
    }


    Student(int studentid, String name, String surname, int cours) {
        this.studentid = studentid;
        this.name = name;
        this.surname = surname;
        this.cours = cours;


    }

    Student(int studentid, String name, String surname) {
        this.studentid = studentid;
        this.name = name;
        this.surname = surname;
    }

      static class StudentTest {
          double sredArifOsenka(Student st) {
              double sredOsenka = (st.matchAverageCrade + st.economicsAvaregeCrade + st.foreinghLanguageAvaregeCrade) / 3;

              System.out.println("Средняя арифмитическая оценка студента" + " " + st.name+" " + st.surname +
                      " " + sredOsenka);
              return sredOsenka;
          }
      }

         public static void main(String[] args) {
             Student st1 = new Student(1, "Ivan", "Sidorov", 2020, 9.5,
                     7.8, 8.5);// Ctrl+P - посмотреть параметры/аргументы конструктора или метода

             Student st2 = new Student(2, "Oleg", "Petrov", 2021);
             st2.cours = 2021;
             st2.matchAverageCrade = 9.9;
             st2.economicsAvaregeCrade = 8.5;
             st2.foreinghLanguageAvaregeCrade = 9.4;

             Student st3 = new Student(3, "Petr", "Ivanon");
             st3.matchAverageCrade = 8.9;
             st3.economicsAvaregeCrade = 7.5;
             st3.foreinghLanguageAvaregeCrade = 9.3;

             StudentTest sTest = new StudentTest();
             sTest.sredArifOsenka(st1);
             sTest.sredArifOsenka(st2);
             sTest.sredArifOsenka(st3);
         }
     }











