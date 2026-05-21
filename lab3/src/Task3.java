public class Task3 {
    public static void execute() {
        int h = 0;
        while (h <= 2) {
            int m = 0;
            while (m <= 59) {
                System.out.println(h + " h " + m + " min");
                m++;
            }
            h++;
        }
    }
}