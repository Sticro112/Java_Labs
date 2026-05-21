public class Phone {
    private String number;
    private String model;
    private double weight;

    // ж) Конструктор без параметрів
    public Phone() {}

    // е) Конструктор з двома параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // д) Конструктор з трьома параметрами
    public Phone(String number, String model, double weight) {
        this(number, model); // Виклик попереднього конструктора
        this.weight = weight;
    }

    // г) Методи receiveCall та getNumber
    public void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    // з) Перевантажений метод receiveCall
    public void receiveCall(String name, String number) {
        System.out.println("Дзвонить " + name + " з номера " + number);
    }

    public String getNumber() {
        return number;
    }

    // к) Метод з аргументами змінної довжини
    public void sendMessage(String... numbers) {
        System.out.println("Надсилаємо повідомлення на номери:");
        for (String num : numbers) {
            System.out.println("- " + num);
        }
    }

    public void displayInfo() {
        System.out.println("Модель: " + model + ", Номер: " + number + ", Вага: " + weight);
    }
}