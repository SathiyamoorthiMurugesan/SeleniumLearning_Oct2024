package string;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Vinothini";
		
		String upper = str.toUpperCase();
		
//		boolean test = upper.equals("Sathya");
		
		boolean test = str.toUpperCase().equals("Sathya");
		
		String aaa = "Sathya    ";
		System.out.println(aaa);
		System.out.println(aaa.trim());
		
		System.out.println(aaa.replaceAll(" ", ""));
		
		System.out.println(str.replaceAll("no", "yes"));
		
		aaa.strip();
		aaa.trim();
		
	}
	
	public void countDuplicates() {

		String str = "Vinothini";

		String[] allString = str.split("");
		
		String dummy = "";
//		int count = 1;
		
		for(int i = 0; i <= allString.length - 1; i++ ) {
			int count = 1;
			for(int j= i+1; j <= allString.length - 1; j++ ) {	
				if(allString[i].equalsIgnoreCase(allString[j])) {
					count = count + 1;
				}
			}
			System.out.println(allString[i] + " is present "+ count + " times");
			if(count == 1) {
				dummy = dummy + allString[i];
			}
		}
		System.out.println(dummy);
		
	
	}

	public void dublicateLetter() {
		String str = "Vinothini";

		String[] allString = str.split("");

		String dummy = "";
		int temp = 0;

		for (int i = 0; i <= allString.length - 1; i++) {
//			temp  = 0;
			if (dummy.contains(allString[i])) {
				temp = temp + 1;
				System.out.println("Count of " + allString[i] + " is " + temp);
			} else {
				dummy = dummy + allString[i];
				temp = temp + 1;
				System.out.println("Count of the " + allString[i] + " is " + temp);
			}
		}

	}

	public void reverseAString() {

		String str = "Vinothini";

		String[] allString = str.split("");

		for (String eachString : allString) {
			System.out.println(eachString);
		}

//		for(int i = 1; i<allString.length; i++) {
//			System.out.print(allString[i]);
//		}

		System.out.println("Reverse A String");

		String ch = "";
		for (int i = allString.length - 1; i >= 0; i--) {
//			String ch = "";
//			System.out.print(allString[i]);
			ch = ch + allString[i];

//			 System.out.println(ch);
		}

		System.out.println(ch);

//		return ch;

	}

	public static void method1() {

		String str = "Vinothini";

		String[] allString = str.split("");

		for (String eachString : allString) {
			System.out.println(eachString);
		}

		char[] eachChar1 = str.toCharArray();

		for (char each : eachChar1) {
			System.out.println(each);
		}

		System.out.println("****************");
		for (int i = 0; i < str.length(); i++) {
			char each = str.charAt(i);
			System.out.println(each);
		}

	}

	public static void method2() {

		String str = "Tamilarasi.; Tamilarasi";
//		String[] arr  = str.split("la");
		String[] arr = str.split(" ");

		System.out.println(arr.length);
		for (String each : arr) {
			System.out.println(each);
		}

		String str1 = "Tamilarasi";
		char[] arr1 = str1.toCharArray();

		System.out.println(arr1.length);
		for (char each : arr1) {
			System.out.println(each);
		}

	}

}
