package Homework;

public class Lesson27 {
    public static void main(String[] args) throws NeMyasoException {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class Tiger {
    public void eat(String eda) throws NeMyasoException {
        if (!eda.equals("myaso")) throw new NeMyasoException("Tiger ne est " + eda);
        System.out.println("Tiger est myaso");
    }

    public void drink(String jidkost) throws NeVodaException {
        if (!jidkost.equals("voda")) {
            throw new NeVodaException("Tiger ne pyet " + jidkost);
        }
        System.out.println("Tiger pyet vody");
    }
}

class NeMyasoException extends Throwable {
    NeMyasoException(String s) {
        super(s);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}