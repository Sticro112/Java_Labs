import java.util.Scanner;

class User {
    int id, age;
    String name, surname;
    double weight, height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id; this.age = age; this.name = name;
        this.surname = surname; this.weight = weight; this.height = height;
    }
}

public class Task3 {
    public static void execute(Scanner scan) {
        User[] users = new User[10];
        int totalAge = 0; double totalWeight = 0, totalHeight = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Введення даних для User " + (i + 1) + ":");
            int id = SafeEngine.readInt(scan, "ID: ");
            int age = SafeEngine.readInt(scan, "Вік: ");
            System.out.print("Ім'я: "); String name = scan.next();
            System.out.print("Прізвище: "); String surname = scan.next();
            double w = SafeEngine.readDouble(scan, "Вага: ");
            double h = SafeEngine.readDouble(scan, "Зріст: ");

            users[i] = new User(id, age, name, surname, w, h);
            totalAge += age; totalWeight += w; totalHeight += h;
        }
        System.out.printf("Разом — Вік: %d, Вага: %.2f, Зріст: %.2f\n", totalAge, totalWeight, totalHeight);
    }
}
