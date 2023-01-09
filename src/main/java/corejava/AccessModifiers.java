package corejava;

public class AccessModifiers extends HRDepartment{
	public static void main(String []args) {
		AccessModifiers obj = new AccessModifiers();
		obj.nehaDubey("HR Manager", "vijay nagar Indore");
		
	}

}


class HRDepartment{
	public void nehaDubey(String TakeName,String address1) {
		
	   int	id=2392;
	String name=TakeName;
	String companyName="aplite";
	String address=address1;
	System.out.println(address);
	
	}
}