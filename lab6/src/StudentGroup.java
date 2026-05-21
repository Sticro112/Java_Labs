public class StudentGroup {
    private String groupName;
    private int totalStudents;
    private int menCount;
    private int womenCount;

    // Конструктор
    public StudentGroup(String name, int total, int men, int women) {
        this.groupName = name;
        this.totalStudents = total;
        this.menCount = men;
        this.womenCount = women;
    }

    // ЛОГІКА: Обчислення відсотка (повертає значення для подальшого використання)
    public double getMenPercentage() {
        if (totalStudents == 0) return 0;
        return (double) menCount / totalStudents * 100d;
    }

    public double getWomenPercentage() {
        if (totalStudents == 0) return 0;
        return (double) womenCount / totalStudents * 100d;
    }

    // Геттери для виведення даних
    public String getGroupName() { return groupName; }
    public int getTotalStudents() { return totalStudents; }
    public int getMenCount() { return menCount; }
    public int getWomenCount() { return womenCount; }
}