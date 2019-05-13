package textAdventure;
import java.util.Scanner;
public class Room {

	private String[][] collave = new String[3][3];
	boolean done = false;
	
	//Current Position
	int curri = 2;
	int currj = 1;
	
	//Inventory Items
	boolean food = false;
	boolean water = true;
	boolean lottery = true;
	boolean lyft = true;
	boolean check = true;
	boolean app = false;
	boolean crosswalk = true;
	boolean quarter = true;
	boolean piano = true;
	boolean snack = true;
	boolean cockroach = true;
	boolean wendy = true;
	boolean gate = true;
	boolean flyer = true;

	//Scanner
	Scanner scn = new Scanner(System.in);
	
	// Create a 2D array for the game map
	public void createMap() {
		collave[0][0] = "SCI";
		collave[0][1] = "Records Hall";
		collave[0][2] = "Honors College";
		collave[1][0] = "Crosswalk";
		collave[1][1] = "Brower";
		collave[1][2] = "Academic Building";
		collave[2][0] = "Gym";
		collave[2][1] = "Student Center";
		collave[2][2] = "Yard";
	}

	// Print game map
	public void printMap() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(collave[i][j]);
			}
		}
	}

	// Move around game map
	public void move(char a) {
		// Current location is Student Center
		if (curri == 2 && currj == 1) {
			if (a == 'w' && food == false) { // Player moves up
				curri = 1;
				System.out.println("You have now entered Brower. Be careful, anything may be poision");
				System.out.println("Do you want to pick up food (y/n)?");
				if (scn.nextLine() == "y")
					food = true;
			} else if (a == 'a'&& water == false) { // Player moves left
				currj = 0;
				System.out.println("You are now in the Gym. Try not to smell anything");
				System.out.println("Do you want to pick up water (y/n)?");
				if (scn.nextLine() == "y")
					water = true;
			} else if (a == 'd' && lottery == false) { // Player moves right
				System.out.println("You see the Yard in the distance. Sadly, that building is too exclusive "
						+ "for a pleb such as yourself");
				System.out.println("Are you going to try to get a good lottery number next year? (y/n)?");
				if (scn.nextLine() == "y")
					lottery = true;
			} else if (a == 's' && app == false) { // Player moves down
				System.out.println("You cannot escape College Ave");
				System.out.println("Do you want to download the Rutgers App? (y/n)?");
				if (scn.nextLine() == "y")
					app = true;
			}
		} else if (curri == 0 && currj == 0) { // Current location is SCI
			if (a == 'w' && lyft == false) { // Player moves up
				System.out.println("You are not allowed to cross RT 18, the bus system is broken");
				System.out.println("Do you want to take a lyft? (y/n)?");
				if (scn.nextLine() == "y")
					lyft = true;
			} else if (a == 'a' && quarter == false) { // Player moves left
				System.out.println("There is nothing interesting that way");
				System.out.println("Do you want to pick up a quarter you found on the floor? (y/n)?");
				if (scn.nextLine() == "y")
					quarter = true;
			} else if (a == 'd' && check == false) { // Player moves right
				currj = 1;
				System.out.println("You have now entered Records Hall. Be ready for a long line");
				System.out.println("Do you want to pick up your refund check? (y/n)?");
				if (scn.nextLine() == "y")
					check = true;
			} else if (a == 's' && crosswalk == false) { // Player moves down
				curri = 1;
				System.out.println("You are on a Crosswalk. Avoid all vehicles");
				System.out.println("Do you want to run accross without clicking the pedestrian button that flashes the lights? (y/n)?");
				if (scn.nextLine() == "y")
					crosswalk = true;
			}
		} else if (curri == 0 && currj == 1) { // Current location is Records
												// Hall
			if (a == 'w' && cockroach == false) { // Player moves up
				System.out.println("You do not want to go that way, as the dorms there have a cockroach " + "infestation");
				System.out.println("Do you want to call RU services to kill the cockroaches? (y/n)?");
				if (scn.nextLine() == "y")
					cockroach = true;
			} else if (a == 'a' && snack == false) { // Player moves left
				currj = 0;
				System.out.println("You are in the glorious SCI building. Apply for it when you can");
				System.out.println("Do you want to pick up a snack at the vending machine? (y/n)?");
				if (scn.nextLine() == "y")
					snack = true;
			} else if (a == 'd' && piano == false) { // Player moves right
				currj = 2;
				System.out.println("You are in your overpriced dorm, the Honors College. "
						+ "Feel free to laugh at the other freshmen who do not have AC");
				System.out.println("Do you want to take a piano key that has broken off the piano? (y/n)?");
				if (scn.nextLine() == "y")
					piano = true;
			} else if (a == 's' && food == false) { // Player moves down
				curri = 1;
				System.out.println("You have now entered Brower. Be careful, anything may be poision");
				System.out.println("Do you want to pick up food (y/n)?");
				if (scn.nextLine() == "y")
					food = true;
				
			}
		} else if (curri == 0 && currj == 2) { // Current location is Honors
												// College
			if (a == 'w' && cockroach == false) { // Player moves up
				System.out.println("You do not want to go that way, as the dorms there have a cockroach " + "infestation");
				System.out.println("Do you want to call RU services to kill the cockroaches? (y/n)?");
				if (scn.nextLine() == "y")
					cockroach = true;
			} else if (a == 'a' && check == false) { // Player moves left
				currj = 1;
				System.out.println("You have now entered Records Hall. Be ready for a long line");
				System.out.println("Do you want to pick up your refund check? (y/n)?");
				if (scn.nextLine() == "y")
					check = true;
			} else if (a == 'd' && lyft == false) { // Player moves right
				System.out.println(
						"You see the train station in the distance. Sadly, you cannot escape " + "College Ave that way");
				System.out.println("Do you want to take a lyft? (y/n)?");
				if (scn.nextLine() == "y")
					lyft = true;
			} else if (a == 's' && class == false) { // Player moves down
				curri = 1;
				System.out.println("You are now in the Academic Building. If you are an econ major,"
						+ "all your classes will be in the same 2 classrooms here");
				System.out.println("Do you want to go on webreg and choose another class? (y/n)?");
				if (scn.nextLine() == "y")
					class = true;
			}
		} else if (curri == 1 && currj == 0) { // Current location is Crosswalk
			if (a == 'w' && snack == false) { // Player moves up
				curri = 0;
				System.out.println("You are in the glorious SCI building. Apply for it when you can");
				System.out.println("Do you want to pick up a snack at the vending machine? (y/n)?");
				if (scn.nextLine() == "y")
					snack = true;
			} else if (a == 'a' && quarter == false) { // Player moves left
				System.out.println("There is nothing interesting that way");
				System.out.println("Do you want to pick up a quarter you found on the floor? (y/n)?");
				if (scn.nextLine() == "y")
					quarter = true;
			} else if (a == 'd' && food == false) { // Player moves right
				currj = 1;
				System.out.println("You have now entered Brower. Be careful, anything may be poision");
				System.out.println("Do you want to pick up food (y/n)?");
				if (scn.nextLine() == "y")
					food = true;
			} else if (a == 's' && water == false) { // Player moves down
				curri = 2;
				System.out.println("You are now in the Gym. Try not to smell anything");
				System.out.println("Do you want to pick up water (y/n)?");
				if (scn.nextLine() == "y")
					water = true;
			}
		} else if (curri == 1 && currj == 1) { // Current location is Brower
			if (a == 'w' && check == false) { // Player moves up
				curri = 0;
				System.out.println("You have now entered Records Hall. Be ready for a long line");
				System.out.println("Do you want to pick up your refund check? (y/n)?");
				if (scn.nextLine() == "y")
					check = true;
			} else if (a == 'a' && crosswalk == false) { // Player moves left
				currj = 0;
				System.out.println("You are on a Crosswalk. Avoid all vehicles");
				System.out.println("Do you want to run accross without clicking the pedestrian button that flashes the lights? (y/n)?");
				if (scn.nextLine() == "y")
					crosswalk = true;
			} else if (a == 'd' && class == false) { // Player moves right
				currj = 2;
				System.out.println("You are now in the Academic Building. If you are an econ major,"
						+ "all your classes will be in the same 2 classrooms here");
				System.out.println("Do you want to go on webreg and choose another class? (y/n)?");
				if (scn.nextLine() == "y")
					class = true;
			} else if (a == 's' && wendy == false) { // Player moves down
				curri = 2;
				System.out.println("You are now in the Student Center. Eat here to avoid Brower");
				System.out.println("Do you want to grab a 4 for 4? (y/n)?");
				if (scn.nextLine() == "y")
					wendy = true;
			}
		} else if (curri == 1 && currj == 2) { // Current location is Academic
												// Building
			if (a == 'w' && piano == false) { // Player moves up
				curri = 0;
				System.out.println("You are in your overpriced dorm, the Honors College. "
						+ "Feel free to laugh at the other freshmen who do not have AC");
				System.out.println("Do you want to take a piano key that has broken off the piano? (y/n)?");
				if (scn.nextLine() == "y")
					piano = true;
			} else if (a == 'a' && food == false) { // Player moves left
				currj = 1;
				System.out.println("You have now entered Brower. Be careful, anything may be poison");
				System.out.println("Do you want to pick up food (y/n)?");
				if (scn.nextLine() == "y")
					food = true;
			} else if (a == 'd' && gate == false) { // Player moves right
				System.out.println("You see Olde Queens. Rumour has it that if you walk through the "
						+ "gate twice you will not graduate. Avoid it at all costs");
				System.out.println("Do you want to walk through it twice to see if it works? (y/n)?");
				if (scn.nextLine() == "y")
					gate = true;
			} else if (a == 's' && lottery == false) { // Player moves down
				System.out.println("You see the Yard in the distance. Sadly, that building is too exclusive "
						+ "for a pleb such as yourself");
				System.out.println("Are you going to try to get a good lottery number next year? (y/n)?");
				if (scn.nextLine() == "y")
					lottery = true;
			}
		} else if (curri == 2 && currj == 0) { // Current location is Gym
			if (a == 'w' && crosswalk == false) { // Player moves up
				curri = 1;
				System.out.println("You are on a Crosswalk. Avoid all vehicles");
				System.out.println("Do you want to run accross without clicking the pedestrian button that flashes the lights? (y/n)?");
				if (scn.nextLine() == "y")
					crosswalk = true;
			} else if (a == 'a' && lyft == false) { // Player moves left
				System.out.println("There is nothing but traffic jams and heartbreak that way");
				System.out.println("Do you want to Take a lyft? (y/n)?");
				if (scn.nextLine() == "y")
					lyft = true;
			} else if (a == 'd' && wendy == false) { // Player moves right
				System.out.println("You are now in the Student Center. Eat here to avoid Brower");
				System.out.println("Do you want to pick up a 4 for 4 (y/n)?");
				if (scn.nextLine() == "y")
					wendy = true;
			} else if (a == 's' && flyer == false) { // Player moves down
				System.out.println("There's only frat houses that way. They are no place for a freshman");
				System.out.println("Do you want to pick up a rush flyer that you found on the floor? (y/n)?");
				if (scn.nextLine() == "y")
					flyer = true;
			}
		}
	}

}
