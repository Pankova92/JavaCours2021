package Lesson5;

 public class Employee {
     int id;
     public String surname;
     int age;
     private double salary;
     String departament;

     public Employee(int id) {
         this.id =id;
     }

     public Employee(String surname) {
         this.surname =surname;
     }

     private Employee(double salary) {
         this.salary = salary;
     }

     public Employee( int id,String surname, int age,double salary,String departament) {
         // TODO назначить поля класса
         this.id = id;
         this.surname = surname;
         this.age = age;
         this.salary = salary;
         this.departament = departament;
     }

     double uvelichenieZarplati() {
         salary *= 2;
         return salary;

 }

         public static void main(String[] args) {
             Employee emp = new Employee(1, "Petrov", 27, 115.5, "kreditovanie");
             Employee emp1 = new Employee(2, "Sidorov", 31, 125.5, "straxovanie");

             emp.uvelichenieZarplati();
             System.out.println("Zarplata posle nadbavki: " + emp.surname + " " + emp.salary);

             emp1.uvelichenieZarplati();
             System.out.println("Zarplata posle nadbavki: " + emp1.surname + " " + emp1.salary);
         }
     }
