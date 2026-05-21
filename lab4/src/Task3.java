import java.util.Scanner;

public class Task3 {
    public static void execute(Scanner scan) {
        int n = safeEngine.readInt(scan, "Введіть кількість елементів масиву (n): ");
        double[] array = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = safeEngine.readDouble(scan, "Елемент [" + i + "]: ");
            sum += array[i];
        }

        System.out.printf("Сума всіх елементів масиву: %.2f\n", sum);
    }
}