import java.util.Scanner;

public class Task3 {
    public static void printArray(int[] array) {
        System.out.print("Елементи масиву: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void execute(Scanner scan) {
        int size = safeEngine.readInt(scan, "Введіть розмір масиву: ");
        int[] userArray = new int[size];
        for (int i = 0; i < size; i++) {
            userArray[i] = safeEngine.readInt(scan, "Елемент [" + i + "]: ");
        }
        printArray(userArray);
    }
}