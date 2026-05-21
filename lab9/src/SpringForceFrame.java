import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpringForceFrame extends JFrame {
    private JTextField txtStiffness; // Поле для жорсткості (k)
    private JTextField txtCompression; // Поле для стиснення (x)
    private JTextField txtResult;     // Поле для результату сили (F)
    private JButton btnCalculate;      // Кнопка розрахунку

    public SpringForceFrame() {
        // Налаштування головного фрейму
        setTitle("Розрахунок сили пружини (Закон Гука)");
        setSize(360, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Вікно по центру екрана
        setLayout(null); // Абсолютне позиціонування компонентів

        // 1. Компоненти для Жорсткості (k)
        JLabel lblStiffness = new JLabel("Жорсткість (k), Н/м:");
        lblStiffness.setBounds(20, 20, 150, 25);
        add(lblStiffness);

        txtStiffness = new JTextField();
        txtStiffness.setBounds(180, 20, 130, 25);
        add(txtStiffness);

        // 2. Компоненти для Стиснення (x)
        JLabel lblCompression = new JLabel("Стиснення (x), м:");
        lblCompression.setBounds(20, 60, 150, 25);
        add(lblCompression);

        txtCompression = new JTextField();
        txtCompression.setBounds(180, 60, 130, 25);
        add(txtCompression);

        // 3. Компоненти для Результату (F)
        JLabel lblResult = new JLabel("Сила (F), Н:");
        lblResult.setBounds(20, 100, 150, 25);
        add(lblResult);

        txtResult = new JTextField();
        txtResult.setBounds(180, 100, 130, 25);
        txtResult.setEditable(false); // Заборона ручного редагування результату
        add(txtResult);

        // 4. Кнопка "Розрахувати"
        btnCalculate = new JButton("Розрахувати");
        btnCalculate.setBounds(100, 150, 140, 30);
        add(btnCalculate);

        // Створення обробника події натискання на кнопку (Слухач подій)
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Зчитування тексту та конвертація у дробові числа
                    double k = Double.parseDouble(txtStiffness.getText().trim());
                    double x = Double.parseDouble(txtCompression.getText().trim());

                    // Обчислення через клас-модель
                    double force = SpringForceModel.calculateForce(k, x);

                    // Виведення результату на екран з округленням до 4 знаків
                    txtResult.setText(String.format("%.4f", force));

                } catch (NumberFormatException ex) {
                    // Обробка помилки некоректного введення тексту/символів
                    JOptionPane.showMessageDialog(SpringForceFrame.this,
                            "Помилка вводу! Будь ласка, введіть коректні числа.",
                            "Помилка", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    // Обробка помилки введення від'ємних значень
                    JOptionPane.showMessageDialog(SpringForceFrame.this,
                            ex.getMessage(), "Помилка валідації", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}