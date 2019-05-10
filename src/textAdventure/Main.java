package textAdventure;

import java.util.Scanner;
import java.util.Random;

public class Main extends Room {

	public static void main(String[] args) {

		// Implement Scanner
		Scanner scn = new Scanner(System.in);
		String name = "";

		// Start Game
		System.out.println("What is your name?");
		name = scn.nextLine();
		System.out.println("Welcome to your first day at Rutgers University, " + name + "! "
				+ "\nDo your best to avoid the RUSCREW and successfully navigate the campus and "
				+ "attend all your classes.");
		printInst();
		System.out.println("If you forget the instructions, press 'p'");
		System.out.println("You are currently in the Student Center");

		Room game1 = new Room();
		game1.createMap();
		// game1.printMap();
		char direction;
		String placeholder;

		while (game1.done == false) {
			direction = ' ';
			System.out.println("Where would you like to go?");
			placeholder = scn.nextLine();
			direction = placeholder.charAt(0);
			if (direction == 'p') {
				printInst();
			}
			if (direction == 'q') {
				game1.done = true;
				System.out.println("The RUSCREW has claimed another victim. You won't be the last one");
			}
			game1.move(direction);
			direction = ' ';
		}
		scn.close();
		
	}
	
	// RUSCREW Aspect
		public static void screw() {
		Random rand= new Random(); 
		int rand_int = rand.nextInt(11);
		int newnum = rand_int%2;
		if (newnum==0) {
			System.out.println("Congrats, You've avoided the RUSCREW"); 
			       }
		else {
			System.out.println("You've been RUSCREWED. ");
			System.out.println("Lose self-esteem. ");  
		     }

		}

	// Instruction List
	public static void printInst() {
		System.out.println("Instruction list: ");
		System.out.println("w: move forward \na: move left \nd: move right \ns: move backward \nq: give up");
	}

}
