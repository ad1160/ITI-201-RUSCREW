package textAdventure;

import java.util.Scanner;

public class Main {

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
		
		
	}

	// Instruction List
	public static void printInst() {
		System.out.println("Instruction list: ");
		System.out.println(
				"f: move forward \nl: move left \nr: move right \nb: move backward");
	}
	
	

}
