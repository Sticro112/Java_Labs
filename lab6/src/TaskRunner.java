import java.util.Scanner;

public class TaskRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n=== Завдання 1: Person ===");
        Person p1 = new Person();
        Person p2 = new Person("Тарас Шевченко", 47);
        p1.talk();
        p2.move();

        System.out.println("\n=== Завдання 2: Phone ===");
        Phone ph1 = new Phone("067-111", "iPhone 15", 170.5);
        ph1.displayInfo();
        ph1.receiveCall("Олег");
        ph1.receiveCall("Жанна", "093-777");
        ph1.sendMessage("067-111", "050-222");

        System.out.println("\n=== Завдання 3-4: Автомобілі ===");
        Sedan mySedan = new Sedan("BMW M3", "Чорний", 250);
        Truck myTruck = new Truck("Volvo FH16", "Білий", 120);
        mySedan.gas();
        mySedan.brake();
        myTruck.gas();
        myTruck.brake();

        System.out.println("\n=== Завдання 5 (Варіант): 8  ===");
        TermGroup.execute(scan);

        scan.close();
        System.out.println("\nУсі завдання виконано успішно.");
    }
}