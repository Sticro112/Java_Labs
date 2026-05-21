public class TaskRunner {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота №8 ===");

        // Перевіряємо, чи передав користувач усі 3 обов'язкові параметри
        if (args.length < 3) {
            System.out.println("Помилка: Недостатньо аргументів!");
            System.out.println("Використання: java TaskRunner <ім'я_файлу> <межа_b1> <межа_b2>");
            return;
        }

        // Отримуємо параметри
        String fileName = args[0];
        int b1;
        int b2;

        // Безпечний парсинг чисел (щоб програма не впала від некоректного вводу)
        try {
            b1 = Integer.parseInt(args[1]);
            b2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Помилка: Межі b1 та b2 мають бути цілими числами!");
            return;
        }

        if (b1 > b2) {
            System.out.println("Помилка: Нижня межа b1 не може бути більшою за верхню b2!");
            return;
        }

        int numbersCount = 15;
        FileService.writeRandomNumbers(fileName, b1, b2, numbersCount);

        FileService.readAndPrintFile(fileName);
    }
}