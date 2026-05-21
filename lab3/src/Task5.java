import java.util.Scanner;

public class Task5 {
    public static void execute(Scanner scan) {
        double lowerBound = safeEngine.readDouble(scan, "Введіть нижню межу діапазону (y_min): ");
        double upperBound = safeEngine.readDouble(scan, "Введіть верхню межу діапазону (y_max): ");

        System.out.println("\n--- Реалізація через FOR  ---");
        int countFor = 0;
        for (double x = 1.0; x <= 3.001; x += 0.1) {
            double y = 2 * Math.cos(x) + 3;
            System.out.printf("x: %.1f | y: %.4f\n", x, y);

            if (y >= lowerBound && y <= upperBound) {
                countFor++;
            }
        }
        printResult(countFor);

        System.out.println("\n--- Реалізація через WHILE  ---");
        int countWhile = 0;
        double x = 1.0;
        while (x <= 3.001) {
            double y = 2 * Math.cos(x) + 3;
            System.out.printf("x: %.1f | y: %.4f\n", x, y);
            if (y >= lowerBound && y <= upperBound) {
                countWhile++;
            }
            x += 0.1;
        }
        printResult(countWhile);
    }

    private static void printResult(int count) {
        if (count > 0) {
            System.out.println("Кількість значень функцій у діапазоні: " + count);
        } else {
            System.out.println("Повідомлення: значення у заданому діапазоні відсутні.");
        }
    }
}