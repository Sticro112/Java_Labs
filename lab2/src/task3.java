import java.util.Scanner;

public class task3 {
    public static void execute(Scanner scan) {
        System.out.println("\n--- Завдання 3 ---");
        System.out.println("Рівняння виду: ax^2 + bx + c = 0");

        double a1;
        // Перевірка: а не може бути 0, бо тоді це лінійне рівняння
        while (true) {
            double a = safeEngine.readDouble(scan, "Введіть коефіцієнт a (не 0): ");
            a1 = a;
            if (a != 0) break;
            System.out.println("Помилка: Коефіцієнт 'a' не може дорівнювати нулю у квадратному рівнянні!");
        }

        double b = safeEngine.readDouble(scan, "Введіть коефіцієнт b: ");
        double c = safeEngine.readDouble(scan, "Введіть коефіцієнт c: ");
        double aa;

        // Обчислення дискримінанта
        double d = Math.pow(b, 2) - 4 * a1 * c;
        System.out.printf("Дискримінант D = %.2f\n", d);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a1);
            double x2 = (-b - Math.sqrt(d)) / (2 * a1);
            System.out.printf("Рівняння має два корені: x1 = %.2f, x2 = %.2f\n", x1, x2);
        } else if (d == 0) {
            double x = -b / (2 * a1);
            System.out.printf("Рівняння має один корінь: x = %.2f\n", x);
        } else {
            System.out.println("Рівняння не має дійсних коренів (D < 0)");
        }
    }
}