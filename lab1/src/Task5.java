import java.util.Scanner;

public class Task5 {
    public static void execute(Scanner scan) {
        int n;
        while (true) {
            n = SafeEngine.readInt(scan, "Введіть тризначне число: ");
            if (n >= 100 && n <= 999) break;
            System.out.println("Помилка: число має бути від 100 до 999!");
        }

        int d3 = n % 10;
        int d2 = (n / 10) % 10;
        int d1 = n / 100;

        int reversed = d3 * 100 + d2 * 10 + d1;
        System.out.println("Результат реверсу: " + reversed);
    }
}