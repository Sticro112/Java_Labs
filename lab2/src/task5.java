import java.util.Scanner;

public class task5 {
    public static void execute(Scanner scan) {
        System.out.println("\n--- Завдання 5: ---");
        double input = safeEngine.readDouble(scan, "Введіть число для перевірки: ");

        // Перевірка на ціле число через залишок від ділення на 1
        if (input % 1 == 0) {
            int num = (int) input;
            boolean isTwoDigit = (Math.abs(num) >= 10 && Math.abs(num) <= 99);
            boolean isEven = (num % 2 == 0);

            System.out.println("Число " + num + " є цілим.");
            System.out.println("Двозначне: " + (isTwoDigit ? "Так" : "Ні"));
            System.out.println("Парне: " + (isEven ? "Так" : "Ні"));
        } else {
            System.out.println("Число " + input + " не є цілим.");
        }
    }
}