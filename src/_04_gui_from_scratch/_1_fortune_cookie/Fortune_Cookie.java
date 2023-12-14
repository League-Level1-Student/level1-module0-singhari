package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;





public class Fortune_Cookie implements ActionListener {
    JFrame frame = new JFrame();
    int rand = new Random().nextInt(5);
    String fortune;
	public void showButton() {
		frame.setVisible(true);
        System.out.println("Button clicked");
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        if(rand ==5) {
        	fortune = "";
        }
        else if(rand == 4) {
        	fortune = "";
        }
        else if(rand == 3) {
        	fortune = "";
        }
        else if(rand == 2) {
        	fortune = "";
        	
        }
        else {
        	fortune = "";
        }
        }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		
	}
}
