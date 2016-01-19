import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;

public class GUI2 extends JFrame {
	public GUI2() {
        initUI();
    }

    private void initUI() {
        setTitle("Project Flacon! (Joe version)");
        setSize(250, 250);
        setLayout(new BorderLayout());
        add(new JLabel("PROJECT FALCON"), BorderLayout.NORTH); //title
        JLabel printed = new JLabel(); //output
        
        JButton btn = new JButton("Print Num"); //button, middle
        btn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		printed.setText(new Random().nextInt(Integer.MAX_VALUE) % 2 == 0 ? "TRUE" : "FALSE");
        	}
        });
        
        add(btn, BorderLayout.CENTER);
        add(printed, BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
