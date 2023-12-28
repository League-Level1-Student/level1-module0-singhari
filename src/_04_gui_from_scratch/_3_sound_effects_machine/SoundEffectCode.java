package _04_gui_from_scratch._3_sound_effects_machine;

import java.io.File;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoundEffectCode implements ActionListener {
	JFrame frame = new JFrame();

	JPanel chanel = new JPanel();
	JButton sawWood = new JButton();
	JButton otherSound1 = new JButton();
	JButton otherSound2 = new JButton();

	// make frame and panel with buttons
	public void run() {
		frame.setVisible(true);
		chanel.add(sawWood);
		chanel.add(otherSound1);
		chanel.add(otherSound2);
		frame.pack();
		sawWood.addActionListener(this);
		otherSound1.addActionListener(this);
		otherSound2.addActionListener(this);
	}

	// play sound
	private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path + soundFile);
		if (sound.exists()) {
			new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}).start();
		} else {
			System.out.println("File does not exist");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed == sawWood) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else if(pressed == otherSound1) {
			playSound("airplane-landing_daniel_simion.wav");
		}
		else if(pressed == otherSound2) {
			playSound("heavy-rain-daniel_simion.wav");
		}
	}

}
