public class BankAccount {
    int id = 14;
    String name = "Petr";
    double balance = 125;


    void popolnenieCheta(double summaPopolneniya) {
        System.out.println("Balance do popolneniya cheta:" + balance);
        System.out.println("Balans popolneniya cheta na :" + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balans popolneniya cheta:" + balance);

    }

    void spisanieSoSheta(double summaSpisaniya) {
        System.out.println("Balance do spisaniya :" + balance);
        System.out.println("Summa spisaniya :" + summaSpisaniya);
        balance -= summaSpisaniya;
        System.out.println("Balance posle spisaniya :" + balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.popolnenieCheta(45.5);
        MyAccount.spisanieSoSheta(29.5);
    }
}



