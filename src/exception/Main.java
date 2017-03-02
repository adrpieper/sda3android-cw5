package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Adrian on 2017-03-02.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Podaj imię");
                String name = scanner.next();
                System.out.println("Podaj nazwisko");
                String lastName = scanner.next();
                System.out.println("Podaj wiek");
                int age = scanner.nextInt();
                Person person = new Person(name, lastName, age);
                System.out.println(person);
                break;
            }catch (InputMismatchException exception){
                System.out.println("Zły format danych.");
            }
        }

    }
}
