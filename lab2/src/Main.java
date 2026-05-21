import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Виклик завдань
        task1.execute(scan);
        task2.execute(scan);
        task3.execute(scan);
        task4.execute(scan);
        task5.execute(scan);

        // Закриття потоку введення
        scan.close();
    }
}