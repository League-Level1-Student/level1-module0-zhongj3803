package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
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

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int score = 0;
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)

		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(
				"https://vignette.wikia.nocookie.net/avatar/images/9/95/Sokka_hallucinates.png/revision/latest/scale-to-width-down/340?cb=20140407161001");
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("What is this thing");
		// 7. print "CORRECT" if the user gave the right answer
		if (question.equals("cactus juice sokka")) {
			System.out.println("correct!");
			score++;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("incorrect :(");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		Component image1;
		image1 = createImage("https://i.pinimg.com/originals/74/cc/f2/74ccf28d88b3606d073f20fe70e53539.png");
		quizWindow.add(image1);
		quizWindow.pack();
		String question1 = JOptionPane.showInputDialog("Who dis?");
		if (question1.equals("sokka")) {
			System.out.println("correct!");
			score++;
		} else {
			System.out.println("incorrect :(");
		}
		quizWindow.remove(image1);

		Component image4;
		image4 = createImage("https://www.gizmodo.com.au/content/uploads/sites/2/2020/06/10/vfezr9zgqrxslaprsqpd.png");
		quizWindow.add(image4);
		quizWindow.pack();
		String question4 = JOptionPane.showInputDialog("What this?");
		if (question4.equals("cabbage man")) {
			System.out.println("correct!");
			score++;
		} else {
			System.out.println("incorrect :(");
		}
		quizWindow.remove(image4);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component image2;
		image2 = createImage(
				"https://preview.redd.it/nx50st82y8351.png?auto=webp&s=f31cdd2db86f73ee5245bf8462fa7df187119254");
		// 11. add the second image to the quiz window
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question2 = JOptionPane.showInputDialog("Who is this?");

		// 14+ check answer, say if correct or incorrect, etc.
		if (question2.equals("appa")) {
			System.out.println("correct!");
			score++;
		} else {
			System.out.println("incorrect :(");
		}
		quizWindow.remove(image2);
		Component image3;
		image3 = createImage("https://static.wikia.nocookie.net/295fe34c-4fff-4e01-ab40-93f0d24b5cce");
		quizWindow.add(image3);
		quizWindow.pack();
		String question3 = JOptionPane.showInputDialog("What is this beauty?");
		if (question3.equals("standing appa")) {
			System.out.println("correct!");
			score++;
		} else {
			System.out.println("incorrect :(");
		}
		quizWindow.remove(image3);
		JOptionPane.showMessageDialog(null, "omgomg ur so gud u got " + score + " correct.");
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
