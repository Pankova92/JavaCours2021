public class Homework {

    int studentid;
    String name;
    String surname;
    int course;
    double mathScore;
    double economeScore;
    double englishScore;

    public Homework( int course ) {
        this.mathScore = 9.0;
        this.economeScore = 9.0;
        this.englishScore = 7.5;
        this.course=course;
        this.studentid=1;
        this.name="Ivan";
        this.surname="Petrov";



}

    public static void main (String[] args) {
       Homework h=new Homework( 2020);

       System.out.println( h.course );


    }}
