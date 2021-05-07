package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("test9.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem xorochego dnya!");
        } catch (FileNotFoundException e) {
            System.out.println("Bil poiman exception" + e);
        } finally {
            System.out.println("Eto finally block");
        }
        System.out.println("Danniy kod yje ne imeet otnocheniya k isklycheniyam");
    }
}
