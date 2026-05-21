public class Task1 {
    public static void execute() {
        String phrase = "JavaRushVidstyi";

        System.out.println("--- Цикл for ---");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + phrase);
        }

        System.out.println("--- Цикл while ---");
        int j = 1;
        while (j <= 50) {
            System.out.println(j + ". " + phrase);
            j++;
        }
    }
}