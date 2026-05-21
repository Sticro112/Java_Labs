import java.util.Scanner;

public class Task2 {
    public static void execute(Scanner scan) {
        System.out.println("Введіть 10 слів для речення:");
        String[] words = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Слово " + (i + 1) + ": ");
            words[i] = scan.next();
        }

        System.out.print("Ваше речення: ");
        for (String w : words) System.out.print(w + " ");
        System.out.println();
    }
}