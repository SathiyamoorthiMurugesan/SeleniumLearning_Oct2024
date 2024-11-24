package string;

import array.ArrayLearning;

public class TestString {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
//		String str = "Sathya";
//		
//		//charAt(int index);
//		
////		System.out.print(str.charAt(5));
////		System.out.print(str.charAt(4));
////		System.out.print(str.charAt(3));
////		System.out.print(str.charAt(2));
////		System.out.print(str.charAt(1));
////		System.out.print(str.charAt(0));
//		
//		for(int i= str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
//		
//		System.out.println();
//		
//		//StringBuilder
//		//StringBuffer
//		
////		split(String regEx)
//		
//		String[] splitedString = str.split("thya");
//		ArrayLearning obj = new ArrayLearning();
//		obj.printArrayValuesUsingBasicForLoop(splitedString);
//		
//		String[] toReverse = str.split(""); //String[] toReverse = {"S", "a", "t", "h", "y", "a"};
//		obj.printArrayValuesUsingBasicForLoop(toReverse);
//		
//		String dummy1 = "";
//		for(int i= toReverse.length-1; i>=0; i--) {
////			System.out.print(toReverse[i]);
//			dummy1 = dummy1 + toReverse[i];
//		}
//		System.out.println(dummy1);
//		
//		//toCharArray()
//		
//		char[] charArr = str.toCharArray(); // char[] charArr = {'S', 'a', 't', 'h', 'y', 'a'};
//		for(int i= charArr.length-1; i>=0; i--) {
//			System.out.print(charArr[i]);
//		}
//		System.out.println();
//		
//		String str1 = "Java is an Object Oriented Programming Language";
//		System.out.println(str1.length());
//		String[] wordSplit = str1.split(" ");
//		System.out.println(wordSplit.length);
//		obj.printArrayValuesUsingBasicForLoop(wordSplit);
		
		
		String str2 = "Java is an Object Oriented Programming Language";
		String[] wordSplit2 = str2.split(" ");
		
		String reversedWords = "";
		for(String eachWord: wordSplit2) {
			String reversedLetters = "";
//			System.out.println(reversedLetters);
			String[] eachLetter = eachWord.split("");
			for(int i = eachLetter.length-1; i>=0; i--) {
				reversedLetters = reversedLetters + eachLetter[i];
			}
//			System.out.println(reversedLetters);
			reversedWords = reversedWords +reversedLetters + " ";
		}
		System.out.println(reversedWords);
		
	}
	public static void main1(String[] args) {
		
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
