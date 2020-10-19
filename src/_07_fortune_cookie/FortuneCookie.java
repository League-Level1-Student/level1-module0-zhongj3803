package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "ur gonna get a girl");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "free vbucks");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "no school");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "ur gonna be rich");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "no fortune for u (:");
		}
	}
}
