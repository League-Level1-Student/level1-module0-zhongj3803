package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
public void run() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	button1.setText("Ducks");
	button2.setText("Frogs");
	button3.setText("Fluffy unicorns!");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.add(panel);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed==button1) {
		showDucks();
	}
	if (buttonPressed==button2) {
		showFrog();
	}
	if (buttonPressed==button3) {
		showFluffyUnicorns();
	}
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
   
   // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
   //work on some Linux implementations 
    try {
    if (System.getProperty("os.name").toLowerCase().contains("linux")) {
    if (Runtime.getRuntime().exec(new String[] { 
     "which", "xdg- open" }).getInputStream().read() != -1) {
    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
    }
    } else {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    }      } catch (Exception e) {
         e.printStackTrace();
    }
}
}

