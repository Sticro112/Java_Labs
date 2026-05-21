import java.util.Scanner;

public class Task2 {
    public static double findMin(double a, double b, double c) {
        System.out.printf("Числа: %.2f, %.2f, %.2f\n", a, b, c);
        double min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void execute(Scanner scan) {
        double n1 = safeEngine.readDouble(scan, "Число 1: ");
        double n2 = safeEngine.readDouble(scan, "Число 2: ");
        double n3 = safeEngine.readDouble(scan, "Число 3: ");

        double min = findMin(n1, n2, n3);
        System.out.println("Найменше число: " + min);
    }
}