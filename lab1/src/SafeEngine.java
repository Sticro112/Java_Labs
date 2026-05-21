import java.util.Scanner;
import java.util.InputMismatchException;

public class SafeEngine {
    public static double readDouble(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Помилка: введіть число (використовуйте кому як роздільник)!");
                scan.next();
            }
        }
    }

    public static int readInt(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Помилка: введіть ціле число!");
                scan.next();
            }
        }
    }
}
