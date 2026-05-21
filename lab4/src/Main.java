import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Завдання 1");
        Task1.execute();

        System.out.println("\nЗавдання 2");
        Task2.execute();

        System.out.println("\nЗавдання 3");
        Task3.execute(scan);

        System.out.println("\nЗавдання 4");
        Task4.execute(scan);

        scan.close();
    }
}