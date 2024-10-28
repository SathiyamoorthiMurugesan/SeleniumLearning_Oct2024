package A1basicsOfJava;

public class Basics {

	public static void main(String[] args) {
		
		Basics obj = new Basics();
		obj.method1("SAS");
		
		String str = "Sathya";
//		String str = new String("Sathya");
		String aa = str.toUpperCase();
		System.out.println(aa);
		
		String bb = str.toLowerCase();
		System.out.println(bb);
		
		String lowerCases = str.toUpperCase().toLowerCase();
		str.toLowerCase().toUpperCase();
	}
	
	
	public int method1(String str) {
		
		return 10;
	}

}
