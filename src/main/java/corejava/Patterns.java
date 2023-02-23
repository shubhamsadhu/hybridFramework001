package corejava;

public class Patterns {
	
	public static void main(String arg[]) {
		Patterns p1 = new Patterns();
		p1.pattern1();
	}
	
	public void pattern1() {
		for(int i=0;i<=5;i++){
			System.out.println(" ");
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			}
	}
}
