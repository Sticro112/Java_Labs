import java.util.Scanner;

public class task4 {
    public static void execute(Scanner scan) {
        System.out.println("\n--- Завдання 4: ---");

        double x = safeEngine.readDouble(scan, "Введіть координату x: ");
        double y = safeEngine.readDouble(scan, "Введіть координату y: ");

        // Логіка визначення положення точки
        if (x > 0 && y > 0) {
            System.out.println("Результат: Точка знаходиться у I квадранті");
        } else if (x < 0 && y > 0) {
            System.out.println("Результат: Точка знаходиться у II квадранті");
        } else if (x < 0 && y < 0) {
            System.out.println("Результат: Точка знаходиться у III квадранті");
        } else if (x > 0 && y < 0) {
            System.out.println("Результат: Точка знаходиться у IV квадранті");
        } else if (x == 0 && y == 0) {
            System.out.println("Результат: Точка знаходиться в початку координат (0,0)");
        } else if (x == 0) {
            System.out.println("Результат: Точка лежить на осі Y");
        } else { // y == 0
            System.out.println("Результат: Точка лежить на осі X");
        }
    }
}