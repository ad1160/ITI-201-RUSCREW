
import java.util.Scanner;
	

	public class MainMethod extends Main{

		public static void main(String[] args) {
			//boolean works=true;
	System.out.println("You're a Scarlet Knight!");
	System.out.println("___________________________________________________________________________________________________");
	System.out.println("Please enter your net id (the one with the letters)");
	Scanner input = new Scanner(System.in);
	String characterName = input.nextLine(); 

	
	//String playertype="";
	System.out.println("Enter Your net id again");
	//Scanner input2 = new Scanner(System.in);
	String morf= input.nextLine();
	
	Adventurer player=new Adventurer();
	player.setName(characterName);
	player.setlName(morf);
	
	System.out.println("___________________________________________________________________________________________________");

	
	System.out.println("Welcome to your first day at Rutgers University! Do your best to avoid the RUSCREW and successfully navigate the campus and attend all your classes.");
	
	
	System.out.println("Debba: Hello "+ player +");
	
	System.out.println("___________________________________________________________________________________________________");
			
	
	AdventureModel game= new AdventureModel();
	game.populatelands();
	//game.printLands();
	String nav;
	int x;
	
	
	
	while(game.end==false)
	{
		nav="";
	x=0;
	System.out.println("Where to next?");
	nav= input.nextLine();
	if (nav.equals("north"))
		x = 1;	
	else if (nav.equals("south"))
		x = 2;	
	else if (nav.equals("west"))
		x = 3;	
	else if (nav.equals("east"))
		x = 4;
	
	game.navigate(x);
	nav="";
	System.out.println("___________________________________________________________________________________________________");
	}
	input.close();
	
	System.out.println("Congrats on getting this far. Now you need to get through the rest of college. Good luck!");
	
		}
	}
	
