
import java.util.Arrays;

public class Task1 {
    public static void execute() {
        int[] evenNums = new int[50];
        int[] oddNums = new int[50];

        for (int i = 0, val = 2; i < 50; i++, val += 2) {
            evenNums[i] = val;
        }

        for (int i = 0, val = 1; i < 50; i++, val += 2) {
            oddNums[i] = val;
        }

        System.out.println("Масив парних чисел заповнено" + Arrays.toString(evenNums));
        System.out.println("Масив непарних чисел заповнено.");

    }
}