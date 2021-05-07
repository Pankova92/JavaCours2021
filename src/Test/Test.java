  package Test;

   public class Test {
        int summa(int a, int b, int c){
        int result=a+b+c;
        return result;
        }

       int sredneeArifm(int a1,int b1, int c1){
            int result2=summa(a1, b1, c1)/3;
            return result2;

       }}

        class Tect1 {
    public static void main(String[] args) {

                Test t=new Test();
                int summaTrexChicel=t.summa(1,2,3);
                System.out.println(summaTrexChicel);
                System.out.println(t.summa( 5,10,15));
                System.out.println(t.sredneeArifm(20,40,60));
            }}
