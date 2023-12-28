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
    String fortune;
    
	public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
    JButton button = new JButton();
    frame.add(button);
    frame.pack();
    int rand = new Random().nextInt(5);
    button.addActionListener(this);
        if(rand ==1) {
        	fortune = "You're a failure!";
        }
        else if(rand == 4) {
        	fortune = "You will slip on a banana today.";
        }
        else if(rand == 3) {
        	fortune = "Watch out for unsuspecting birds.";
        }
        else if(rand == 2) {
        	fortune = "You're going to fail your test.";
        }
        else {
        	fortune = "Oops, someone deleted all your code on your latest project.";
        }
      }

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, fortune);
	    System.out.println("Button clicked");
	    showButton();
	}
}
