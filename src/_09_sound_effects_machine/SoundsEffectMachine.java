package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundsEffectMachine implements ActionListener {
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
	public void run() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	button1.setText("button1");
	button2.setText("button2");	
	button3.setText("button3");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	JPanel panel = new JPanel();
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.add(panel);
	frame.pack();
	
}

@Override
public void actionPerformed(ActionEvent f) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) f.getSource();
	if (buttonPressed==button1) {
		playSound("gunhammer.wav");
	}
	if (buttonPressed==button2) {
		playSound("shortclick.wav");
	}
	if (buttonPressed==button3) {
		playSound("whoosh.wav");
	}
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
}
