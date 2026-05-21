public class Task2 {
    public static void execute() {
        int[] data = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.print("Цикл while: ");
        int i = 0;
        while (i < data.length) {
            System.out.print(data[i++] + " ");
        }

        System.out.print("\nЦикл for: ");
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j] + " ");
        }

        System.out.print("\nНепарні індекси (while): ");
        int k = 1;
        while (k < data.length) {
            System.out.print(data[k] + " ");
            k += 2;
        }

        System.out.print("\nПарні індекси (for): ");
        for (int m = 0; m < data.length; m += 2) {
            System.out.print(data[m] + " ");
        }

        System.out.print("\nЗворотний порядок: ");
        for (int r = data.length - 1; r >= 0; r--) {
            System.out.print(data[r] + " ");
        }
        System.out.println();
    }
}