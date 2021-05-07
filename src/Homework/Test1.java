package Homework;


    class Test1{
        int a=1;
         static int b=2;               //   ошибка изза двух переменных с одинаковым названиваем
        void abc(int a){
            System.out.println(a);
            System.out.println(this.a);
        }

        public static void main(String[] args) {
            Homework.Test1 t = new Homework.Test1();
            t.abc(3);
        }

    }
