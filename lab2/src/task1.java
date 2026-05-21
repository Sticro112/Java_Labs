import java.util.Scanner;

public class task1 {
    public static void execute(Scanner scan) {
        System.out.println("\n--- ЗАВДАННЯ 1  ---");
        System.out.println("\n Обчислення f(x): якщо x < -2 (f(x) = e^(2x)), якщо -2 <= x <= 5 f(x) = ctg(x) = 1 / tg(x), якщо x > 5 f(x) = x^4");
        double x = safeEngine.readDouble(scan, "Введіть x: ");
        double f;

        if (x < -2) {
            f = Math.exp(2 * x);
        } else if (x <= 5) {
            // ctg(x) = 1 / tg(x)
            f = 1.0 / Math.tan(x);
        } else {
            f = Math.pow(x, 4);
        }

        System.out.printf("Результат f(x) = %.4f\n", f);
    }
}