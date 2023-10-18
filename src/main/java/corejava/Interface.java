
//**Interface is a medium for the objects to interact with outside world.


package corejava;

import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
		Remote remote = new Television();
		remote.powerOn();

	}
	

}

interface Remote{
	//interface only contians abstract methods
	//Methods are by default abstract & public in nature.
	//avoid using variable within Interface
	//Variable are by default public, static & final in nature.
	void powerOn();
}

class Television implements Remote{

	
	public void powerOn() {
		Scanner takeinputScanner = new Scanner(System.in);
	}

}
