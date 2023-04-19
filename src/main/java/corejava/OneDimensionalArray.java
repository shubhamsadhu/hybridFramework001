package corejava;

public class OneDimensionalArray {
	
	private static  OneDimensionalArray onedimensionalarray;
	
	public static void main(String [] args) {
		
		int []arr= {12,34,546,789,43,34,34,43};
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
		onedimensionalarray = new OneDimensionalArray();
		onedimensionalarray.array();
		
	}
	
	
	public void array() {
		String []playernames = {"raghav","vivek","kunal","krishna"};
		
		for(int a=0;a<playernames.length;a++) {
			System.out.println(playernames[a]);
		}
	}

}
