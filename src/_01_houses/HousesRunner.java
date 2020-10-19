package _01_houses;

public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		Houses house = new Houses();
		house.rob.setX(50);
		house.rob.setY(400);
		house.rob.miniaturize();
		house.run("large", "blue");
		house.run("small","green");
		house.run("medium","magenta");
		house.run("large", "cyan");
		house.run("small", "cyan");
		house.run("medium", "blue");
		house.run("small","green");
		house.run("small", "cyan");
		house.run("large", "magenta");
		house.run("medium", "blue");


	}

}
