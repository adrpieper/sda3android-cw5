package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Adrian on 2017-03-02.
 */
public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream("jakisPlik.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Pliku nie ma");
        }

    }
}
