import java.util.Scanner;

class Car {
    int hp;
    double volume;
    String model, brand, color;
    int year;
    boolean isNew;

    public Car(int hp, double volume, String model, String brand, String color, int year, boolean isNew) {
        this.hp = hp; this.volume = volume; this.model = model;
        this.brand = brand; this.color = color; this.year = year; this.isNew = isNew;
    }
}

public class Task4 {
    public static void execute(Scanner scan) {
        Car[] cars = new Car[10];
        double sumVol = 0; int sumHp = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Авто #" + (i + 1));
            int hp = SafeEngine.readInt(scan, "Кінські сили: ");
            double vol = SafeEngine.readDouble(scan, "Об'єм: ");
            System.out.print("Модель: "); String m = scan.next();

            cars[i] = new Car(hp, vol, m, "Unknown", "Black", 2024, true);
            sumHp += hp;
            sumVol += vol;
        }
        System.out.printf("Сумарна потужність: %d HP, Сумарний об'єм: %.2f L\n", sumHp, sumVol);
    }
}