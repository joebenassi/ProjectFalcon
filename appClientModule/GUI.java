import javax.swing.JFrame;

public class GUI extends JFrame {
	public GUI() {
        initUI();
    }

    private void initUI() {
        setTitle("Project Flacon!");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
