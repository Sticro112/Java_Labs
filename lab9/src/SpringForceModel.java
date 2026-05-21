public class SpringForceModel {
    /**
     * Обчислює силу за Законом Гука: F = k * x
     * @param k - жорсткість пружини (Н/м)
     * @param x - величина стиснення (м)
     * @return сила F (Н)
     */
    public static double calculateForce(double k, double x) {
        if (k < 0 || x < 0) {
            throw new IllegalArgumentException("Жорсткість та стиснення не можуть бути від'ємними!");
        }
        return k * x;
    }
}