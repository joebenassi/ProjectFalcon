import javax.swing.JFrame;

public class GUI2 extends JFrame {
	public GUI2() {
        initUI();
    }

    private void initUI() {
        setTitle("Project Flacon! (Joe version)");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
