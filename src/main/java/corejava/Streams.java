package corejava;

import java.util.ArrayList;

public class Streams {

	public static void main(String[] args) {
		

	}

}

 class test1{
	
	 public void getItem() {
			ArrayList<String> names = new ArrayList<String>();
			names.add("abujar");
			names.add("Swati");
			names.add("aditya");
			names.add("shubham");
			int count = 0;
			
			for(int i=0;i<=names.size();i++) {
				String actual = names.get(i);
				if(actual.startsWith("a")) {
					count++;
				}
			}
			
			
	 }

	
}
