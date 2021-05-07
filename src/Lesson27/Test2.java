package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder rezult = new StringBuilder(" ");
        try {
            File f = new File ("test9.txt");
            System.out.println("Obect file sozdalsya");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalsya");
            int counter = 0;
            while (true){
                counter ++;
                rezult.append(fis.read());
                System.out.println("Informaciya chitaetsya");
                if (counter == 3){
                    fis.close();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        }
        finally {
            System.out.println("Eto finally");
        }
    }
}
