import java.util.Scanner;

public class Task1 {
    public static void execute(Scanner scan) {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = SafeEngine.readInt(scan, "Введіть число #" + (i + 1) + ": ");
        }

        int sum = 0, sub = nums[0];
        long mul = 1;
        for (int i = 0; i < 10; i++) {
            sum += nums[i];
            mul *= nums[i];
            if (i > 0) sub -= nums[i];
        }
        double div = (double) nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] != 0) div /= nums[i];
        }

        System.out.printf("Сума: %d, Різниця: %d, Добуток: %d, Частка: %.8f\n", sum, sub, mul, div);
    }
}