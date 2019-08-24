/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		double gravityConst = 9.8;
		Scanner scanner = new Scanner(System.in);
		double time = scanner.nextDouble();
		double distance = (gravityConst * time * time) / 2;
		double speed = gravityConst * time;
        System.out.println("The speed of the object at " + time +  " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + "seconds after the relase is " + distance);
		scanner.close();

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
