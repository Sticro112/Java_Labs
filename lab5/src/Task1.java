import java.util.Scanner;

public class Task1 {
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static void execute(Scanner scan) {
        double a = safeEngine.readDouble(scan, "Введіть сторону квадрата: ");
        double area = calculateSquareArea(a);
        System.out.println("Площа квадрата: " + area);
    }

    public static void test1(){
        for(int i = 0; i <= 10; i++){
            double back = calculateSquareArea(i);
            System.out.println(back);
        }
    }
}