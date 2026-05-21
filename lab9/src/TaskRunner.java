import javax.swing.SwingUtilities;

public class TaskRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SpringForceFrame frame = new SpringForceFrame();
                frame.setVisible(true);
            }
        });
    }
}