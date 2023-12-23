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
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, fortune);
		rand = new Random().nextInt(5);
	}
}
