import java.util.Scanner;

public class Task4 {
    public static void execute(Scanner scan) {
        int size = safeEngine.readInt(scan, "Введіть розмір масиву: ");
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = safeEngine.readInt(scan, "Введіть ціле число [" + i + "]: ");
        }

        System.out.print("Оновлений масив (змінено знаки непарних чисел): ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = -array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}