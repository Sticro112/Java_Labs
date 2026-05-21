import java.util.Scanner;

public class TermGroup {
    public static void execute(Scanner scan) {
        System.out.println("=== Завдання 5: Студентська група ===");

        System.out.print("Введіть назву групи: ");
        String name = scan.next();

        int total = safeEngine.readInt(scan, "Загальна кількість студентів: ");
        int men = safeEngine.readInt(scan, "Кількість чоловіків: ");
        int women = safeEngine.readInt(scan, "Кількість жінок: ");

        // Перевірка на логічну помилку (сума чоловіків і жінок)
        if (men + women > total) {
            System.out.println("Помилка: сума чоловіків і жінок перевищує загальну кількість!");
            return;
        }

        // Створення об'єкта
        StudentGroup group = new StudentGroup(name, total, men, women);

        // Виведення даних
        System.out.println("\n--- Результати аналізу групи ---");
        System.out.println("Група: " + group.getGroupName());
        System.out.println("Всього студентів: " + group.getTotalStudents());
        System.out.printf("Чоловіків: %d (%.2f%%)\n",
                group.getMenCount(), group.getMenPercentage());
        System.out.printf("Жінок: %d (%.2f%%)\n",
                group.getWomenCount(), group.getWomenPercentage());
    }
}