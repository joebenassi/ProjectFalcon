import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.Random;

public class GUI2 extends JFrame {
	public GUI2() {
        initUI();
    }

    private void initUI() {
        setTitle("Project Flacon! (Joe version)");
        setSize(250, 150);
        setLayout(new BorderLayout());
        add(new JLabel("PROJECT FALCON"), BorderLayout.NORTH); //title
        JLabel printed = new JLabel(); //output
        JTextField minTextBox = new JTextField();
        minTextBox.setMinimumSize(new Dimension(10, 25));
        JTextField maxTextBox = new JTextField();
        maxTextBox.setMinimumSize(new Dimension(10, 25));
        
        JButton btn = new JButton("Print Num"); //button, middle
        btn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String cell1text = minTextBox.getText();
        		String cell2text = maxTextBox.getText();
        		
        		try {
        			int min = Integer.parseInt(cell1text);
        			int max = Integer.parseInt(cell2text);
        			printed.setText((new Random().nextInt(max-min+1) + min) + "");
        		} catch (Exception ex) {
        			// do nothing
        		}
        	}
        });
        
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(1, 2));
        textPanel.add(minTextBox);
        textPanel.add(maxTextBox);

        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.EAST);
        add(printed, BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
