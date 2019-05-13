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
			} else if (a == 'd') { // Player moves right
				System.out.println("You see the Yard in the distance. Sadly, that building is too exclusive "
						+ "for a pleb such as yourself");
			} else if (a == 's') { // Player moves down
				System.out.println("You cannot escape College Ave");
			}
		} else if (curri == 0 && currj == 0) { // Current location is SCI
			if (a == 'w') { // Player moves up
				System.out.println("You are not allowed to cross RT 18, the bus system is broken");
			} else if (a == 'a') { // Player moves left
				System.out.println("There is nothing interesting that way");
			} else if (a == 'd') { // Player moves right
				currj = 1;
				System.out.println("You have now entered Records Hall. Be ready for a long line");
			} else if (a == 's') { // Player moves down
				curri = 1;
				System.out.println("You are on a Crosswalk. Avoid all vehicles");
			}
		} else if (curri == 0 && currj == 1) { // Current location is Records
												// Hall
			if (a == 'w') { // Player moves up
				System.out
						.println("You do not want to go that way, as the dorms there have a cockroach " + "infestation");
			} else if (a == 'a') { // Player moves left
				currj = 0;
				System.out.println("You are in the glorious SCI building. Apply for it when you can");
			} else if (a == 'd') { // Player moves right
				currj = 2;
				System.out.println("You are in your overpriced dorm, the Honors College. "
						+ "Feel free to laugh at the other freshmen who do not have AC");
			} else if (a == 's') { // Player moves down
				curri = 1;
				System.out.println("You have now entered Brower. Be careful, anything may be poision");
			}
		} else if (curri == 0 && currj == 2) { // Current location is Honors
												// College
			if (a == 'w') { // Player moves up
				System.out
						.println("You do not want to go that way, as the dorms there have a cockroach " + "infestation");
			} else if (a == 'a') { // Player moves left
				currj = 1;
				System.out.println("You have now entered Records Hall. Be ready for a long line");
			} else if (a == 'd') { // Player moves right
				System.out.println(
						"You see the train station in the distance. Sadly, you cannot escape " + "College Ave that way");
			} else if (a == 's') { // Player moves down
				curri = 1;
				System.out.println("You are now in the Academic Building. If you are an econ major,"
						+ "all your classes will be in the same 2 classrooms here");
			}
		} else if (curri == 1 && currj == 0) { // Current location is Crosswalk
			if (a == 'w') { // Player moves up
				curri = 0;
				System.out.println("You are in the glorious SCI building. Apply for it when you can");
			} else if (a == 'a') { // Player moves left
				System.out.println("There is nothing interesting that way");
			} else if (a == 'd') { // Player moves right
				currj = 1;
				System.out.println("You have now entered Brower. Be careful, anything may be poision");
			} else if (a == 's') { // Player moves down
				curri = 2;
				System.out.println("You are now in the Gym. Try not to smell anything");
			}
		} else if (curri == 1 && currj == 1) { // Current location is Brower
			if (a == 'w') { // Player moves up
				curri = 0;
				System.out.println("You have now entered Records Hall. Be ready for a long line");
			} else if (a == 'a') { // Player moves left
				currj = 0;
				System.out.println("You are on a Crosswalk. Avoid all vehicles");
			} else if (a == 'd') { // Player moves right
				currj = 2;
				System.out.println("You are now in the Academic Building. If you are an econ major,"
						+ "all your classes will be in the same 2 classrooms here");
			} else if (a == 's') { // Player moves down
				curri = 2;
				System.out.println("You are now in the Student Center. Eat here to avoid Brower");
			}
		} else if (curri == 1 && currj == 2) { // Current location is Academic
												// Building
			if (a == 'w') { // Player moves up
				curri = 0;
				System.out.println("You are in your overpriced dorm, the Honors College. "
						+ "Feel free to laugh at the other freshmen who do not have AC");
			} else if (a == 'a') { // Player moves left
				currj = 1;
				System.out.println("You have now entered Brower. Be careful, anything may be poison");
			} else if (a == 'd') { // Player moves right
				System.out.println("You see Olde Queens. Rumour has it that if you walk through the "
						+ "gate twice you will not graduate. Avoid it at all costs");
			} else if (a == 's') { // Player moves down
				System.out.println("You see the Yard in the distance. Sadly, that building is too exclusive "
						+ "for a pleb such as yourself");
			}
		} else if (curri == 2 && currj == 0) { // Current location is Gym
			if (a == 'w') { // Player moves up
				curri = 1;
				System.out.println("You are on a Crosswalk. Avoid all vehicles");
			} else if (a == 'a') { // Player moves left
				System.out.println("There is nothing but traffic jams and heartbreak that way");
			} else if (a == 'd') { // Player moves right
				System.out.println("You are now in the Student Center. Eat here to avoid Brower");
			} else if (a == 's') { // Player moves down
				System.out.println("There's only frat houses that way. They are no place for a freshman");
			}
		}
	}

}
