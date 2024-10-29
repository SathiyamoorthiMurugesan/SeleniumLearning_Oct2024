package returnTypeAndParameters;

public class PracticeReturnAndParameters {

	public static void main(String[] args) {
		String str = "Sathya";
		String upper = str.toUpperCase();
		System.out.println(upper);
		
//		Sathya - I want to make everything small case;
		String lower = str.toLowerCase();
		System.out.println(lower);
		
//		Sathya - I want to make it to lowere case first then to upper case
		str.toLowerCase().toUpperCase();
		
		String aa = str.toLowerCase();
		String bb = aa.toUpperCase();
		
		String bb1 = str.toLowerCase().toUpperCase();
		
//		Sathya - I want to make it to lower case and validate it  with text "Sathya".
		String cc = str.toLowerCase(); //sathya
		boolean dd = cc.equals("Sathya"); //sathya vs Sathya
		System.out.println(dd);
		
		boolean aac = str.toLowerCase().equals("abc");
		System.out.println(aac);
		
		String word = "Sathya";
		boolean A1 = str.toLowerCase().equalsIgnoreCase(word);//sathya vs Sathya
		System.out.println(A1);
	}

}
