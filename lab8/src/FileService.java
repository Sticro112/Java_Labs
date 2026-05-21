import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileService {

    // Метод для запису випадкових чисел у файл
    public static void writeRandomNumbers(String fileName, int b1, int b2, int count) {
        File file = new File(fileName);

        // Перевірка існування файлу (як вимагає завдання)
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Файл не існував і був успішно створений: " + fileName);
                }
            } catch (IOException e) {
                System.out.println("Помилка при створенні файлу: " + e.getMessage());
                return;
            }
        }

        // Запис чисел за допомогою FileWriter
        try (FileWriter writer = new FileWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                // Формула з методички: [b1, b2]
                int randomNumber = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(randomNumber + " "); // Записуємо через пробіл
            }
            System.out.println("Генерація завершена. Числа записані у " + fileName);
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    // Метод для читання та виведення вмісту (щоб перевірити результат)
    public static void readAndPrintFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            System.out.print("Вміст файлу " + fileName + ": ");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println(); // Перехід на новий рядок
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}