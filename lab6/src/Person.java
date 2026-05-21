public class Person {
    private String fullName;
    private int age;

    // Конструктор без параметрів
    public Person() {
        this.fullName = "Невідомо";
        this.age = 0;
    }

    // Конструктор з параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається.");
    }

    public void talk() {
        System.out.println(fullName + " говорить.");
    }
}