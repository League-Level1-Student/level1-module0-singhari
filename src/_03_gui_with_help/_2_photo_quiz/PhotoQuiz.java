package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
String link = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Seagull_July_2014-2.jpg/1024px-Seagull_July_2014-2.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component birb = createImage(link);
String linkylink = "https://i.kym-cdn.com/entries/icons/facebook/000/023/897/inhalegull.jpg";
		// 3. use the "createImage()" method below to initialize your Component
Component meme = createImage(linkylink);
quizWindow.add(birb);
		// 4. add the image to the quiz window
quizWindow.pack();
		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image
String ques = "Where was this photo taken?";
		// 7. print "CORRECT" if the user gave the right answer
String answer  = JOptionPane.showInputDialog(ques);
		// 8. print "INCORRECT" if the answer is wrong
if(answer.toLowerCase().equals("portugal")) {
	System.out.println("CORRECT");
}
else {
	System.out.println("INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(birb);
		// 10. find another image and create it (might take more than one line
		// of code)
quizWindow.add(meme);
		// 11. add the second image to the quiz window
quizWindow.pack();
		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
