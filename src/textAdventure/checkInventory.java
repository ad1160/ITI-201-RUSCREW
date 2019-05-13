package textAdventure;

public class checkInventory {

private String item;
	
public checkInventory(String item) {
	this.item = item;
	}

public boolean checkPickBook() { 
	item.toLowerCase();
	if (item.equals("pick book")) {
		return true;
	} else {
		return false;
	}
}

public boolean checkDropBook() { 
	item.toLowerCase();
	if (item.equals("drop book")) {
		return true;
	} else {
		return false;
	}
}

public boolean checkPickId() { 
	item.toLowerCase();
	if (item.equals("pick id")) {
		return true;
	} else {
		return false;
	}
}

public boolean checkDropId() { 
	item.toLowerCase();
	if (item.equals("drop id")) {
		return true;
	} else {
		return false;
	}
}

public boolean checkPickFood() { 
	item.toLowerCase();
	if (item.equals("pick food")) {
		return true;
	} else {
		return false;
	}
}

public boolean checkDropFood() { 
	item.toLowerCase();
	if (item.equals("drop food")) {
		return true;
	} else {
		return false;
	}
}

public boolean checkPickMoney() { 
	item.toLowerCase();
	if (item.equals("pick money")) {
		return true;
	} else {
		return false;
	}
}

public boolean checkDropMoney() { 
	item.toLowerCase();
	if (item.equals("drop money")) {
		return true;
	} else {
		return false;
	}
}

}

// ask inventory selection question in room
// call question in main
// check answer in main (with this class)