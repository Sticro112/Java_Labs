import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Завдання 1: ===");
        Task1.execute();

        System.out.println("\n=== Завдання 2: ===");
        Task2.execute();

        System.out.println("\n=== Завдання 3: ===");
        Task3.execute();

        System.out.println("\n=== Завдання 4: ===");
        Task4.execute();

        System.out.println("\n=== Завдання 5: ===");
        Task5.execute(scan);

        scan.close();
    }
}