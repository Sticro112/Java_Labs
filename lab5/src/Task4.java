import java.util.Scanner;

public class Task4 {
    public static int findMax(int[] array) {
        if (array.length == 0) return 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static void execute(Scanner scan) {
        int size = safeEngine.readInt(scan, "Введіть кількість чисел у масиві: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = safeEngine.readInt(scan, "Число #" + (i + 1) + ": ");
        }
        System.out.println("Найбільше число в масиві: " + findMax(array));
    }
}