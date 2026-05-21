import java.util.Scanner;

public class task2 {
    public static void execute(Scanner scan) {
        System.out.println("\n--- ЗАВДАННЯ 2  ---");

        // 1. Робочий чи вихідний день
        int day;
        while (true) {
            day = safeEngine.readInt(scan, "1. Введіть номер дня тижня (1-7): ");
            if (day >= 1 && day <= 7) break;
            System.out.println("Помилка! День має бути від 1 до 7.");
        }
        switch (day) {
            case 1: case 2: case 3: case 4: case 5: System.out.println("Результат: Робочий день"); break;
            case 6: case 7: System.out.println("Результат: Вихідний"); break;
        }

        // 2. Пора року
        int monthSeason;
        while (true) {
            monthSeason = safeEngine.readInt(scan, "\n2. Введіть номер місяця для пори року (1-12): ");
            if (monthSeason >= 1 && monthSeason <= 12) break;
            System.out.println("Помилка! Введіть число від 1 до 12.");
        }
        switch (monthSeason) {
            case 12: case 1: case 2: System.out.println("Результат: Зима"); break;
            case 3: case 4: case 5: System.out.println("Результат: Весна"); break;
            case 6: case 7: case 8: System.out.println("Результат: Літо"); break;
            case 9: case 10: case 11: System.out.println("Результат: Осінь"); break;
        }

        // 3. Кількість днів у місяці
        int mDays;
        while (true) {
            mDays = safeEngine.readInt(scan, "\n3. Введіть номер місяця для підрахунку днів (1-12): ");
            if (mDays >= 1 && mDays <= 12) break;
            System.out.println("Помилка! Невірний номер місяця.");
        }
        switch (mDays) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Результат: 31 день"); break;
            case 4: case 6: case 9: case 11:
                System.out.println("Результат: 30 днів"); break;
            case 2:
                System.out.println("Результат: 28 або 29 днів (залежно від року)"); break;
        }

        // 4. Текстове меню привітань
        int menu1;
        while (true) {
            System.out.println("\n4. Меню:");
            System.out.println("1 - Привітання");
            System.out.println("2 - Запрошення до роботи");
            System.out.println("3 - Завершення");
            menu1 = safeEngine.readInt(scan, "Ваш вибір: ");
            if (menu1 >= 1 && menu1 <= 3) break;
            System.out.println("Помилка! Оберіть пункт від 1 до 3.");
        }
        switch (menu1) {
            case 1: System.out.println("Вітаємо у програмі!"); break;
            case 2: System.out.println("Будь ласка, розпочніть роботу на комп'ютері."); break;
            case 3: System.out.println("Пропонуємо завершити роботу. Бувайте!"); break;
        }

        // 5. Розклад пар
        int para;
        while (true) {
            para = safeEngine.readInt(scan, "\n5. Введіть номер пари (1-4): ");
            if (para >= 1 && para <= 4) break;
            System.out.println("Помилка! Введіть число від 1 до 4.");
        }
        switch (para) {
            case 1: System.out.println("Предмет: Вища математика"); break;
            case 2: System.out.println("Предмет: Об'єктно-орієнтоване програмування"); break;
            case 3: System.out.println("Предмет: Фізичне виховання"); break;
            case 4: System.out.println("Предмет: Іноземна мова"); break;
        }

        // 6. Чверть години
        int min;
        while (true) {
            min = safeEngine.readInt(scan, "\n6. Введіть хвилини (0-59): ");
            if (min >= 0 && min <= 59) break;
            System.out.println("Помилка! Хвилини мають бути в діапазоні від 0 до 59.");
        }
        switch (min / 15) {
            case 0: System.out.println("Результат: Перша чверть"); break;
            case 1: System.out.println("Результат: Друга чверть"); break;
            case 2: System.out.println("Результат: Третя чверть"); break;
            case 3: System.out.println("Результат: Четверта чверть"); break;
        }

        // 7. Текстове меню (арифметичні операції)
        int op;
        while (true) {
            System.out.println("\n7. Оберіть операцію:");
            System.out.println("1 - Добуток");
            System.out.println("2 - Сума");
            System.out.println("3 - Різниця");
            op = safeEngine.readInt(scan, "Ваш вибір: ");
            if (op >= 1 && op <= 3) break;
            System.out.println("Помилка! Оберіть пункт 1, 2 або 3.");
        }
        double n1 = safeEngine.readDouble(scan, "Введіть перше число: ");
        double n2 = safeEngine.readDouble(scan, "Введіть друге число: ");
        switch (op) {
            case 1: System.out.printf("Добуток: %.2f\n", (n1 * n2)); break;
            case 2: System.out.printf("Сума: %.2f\n", (n1 + n2)); break;
            case 3: System.out.printf("Різниця: %.2f\n", (n1 - n2)); break;
        }
    }
}