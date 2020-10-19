package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run(String heightVal, String color) {
		int height = 0;
		if (heightVal.equals("small")) {
			height = 60;
		}
		if (heightVal.equals("medium")) {
			height = 120;
		}
		if (heightVal.equals("large")) {
			height = 250;
		}

		if (color.equals("green")) {
			rob.setPenColor(Color.green);
		}
		if (color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		if (color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		if (color.equals("magenta")) {
			rob.setPenColor(Color.magenta);
		}
		if (color.equals("cyan")) {
			rob.setPenColor(Color.cyan);
		}
		
		rob.penDown();
		rob.setSpeed(20);
		rob.move(height);		
		if (heightVal.equals("large")) {
drawFlatRoof();
		}

		else {
drawPointyRoof();
		}
		rob.move(height);
		rob.setPenColor(Color.GREEN);
		rob.turn(-90);
		rob.move(5);
		rob.turn(-90);
	}
void drawPointyRoof() {
	rob.turn(45);
	rob.move(5 * 2 ^ (1 / 2));
	rob.turn(90);
	rob.move(5 * 2 ^ (1 / 2));
	rob.turn(45);
}

void drawFlatRoof() {
	rob.turn(90);
	rob.move(10);
	rob.turn(90);
}
	
}