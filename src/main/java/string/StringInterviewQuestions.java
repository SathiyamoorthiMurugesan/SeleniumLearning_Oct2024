package string;

import array.DemoArray;

public class StringInterviewQuestions {

	public static void main(String[] args) {
//		reverseAStringUsingCharAt("Sathya");
//		
//		String reversedString = reverseAStringUsingCharAt("Selvi");
//		System.out.println("Reversed String is "+reversedString);
		
//		reverseAStringUsingToCharArray("Sathya");
		
//		reverseAStringUsingSplitMethod("Sathiyamoorthi");
		
//		countWordsInASentence();
		
		reverseAllWordsInASentence();
	}
	
	public static void practiceCharAtMethod() {
		String str = "Sathya";

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));

		for (int i = 0; i < str.length(); i++) {
			char myChar = str.charAt(i);
			System.out.println(str.charAt(i));
			if (myChar == 'a') {
				System.out.println("Hello 'a'");
			}
		}
	}

	public static String reverseAStringUsingCharAt(String str) {
//		Sathya 
//		ayhtaS

//		String str = "Sathya";
//		String str = "Yugandhar";
		
//		charAt();
//		for loop
		
		String temp = "";
		
		for(int i = str.length()-1; i>=0; i--) {
//			System.out.println(str.charAt(i));
//			System.out.print(str.charAt(i));
			
			temp = temp + str.charAt(i);
		}
		
		return temp;

	}
	
	public static void reverseAStringUsingToCharArray(String str) {
		
		char[] array = str.toCharArray();
		
//		DemoArray obj = new DemoArray();
//		
//		obj.printCharArrayUsingBasicForLoop(myArr);
		
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
	}
	
	public static String reverseAStringUsingSplitMethod(String str) {
		
		String[] array = str.split("");
//		for(int i = 0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		String temp = "";
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]);	
			temp = temp.concat(array[i]);
//			temp = temp + array[i];
		}
		
		return temp;
	}
	
	public static void countWordsInASentence() {
		
		String str = "Built by Microsoft, Playwright is a Node.js library that, with a single API, automates Chromium, Firefox, and WebKit. These APIs can be used by developers writing JavaScript code to create new browser pages, navigate to URLs and then interact with elements on a page. In addition, since Microsoft Edge is built on the open-source Chromium web platform, Playwright can also automate Microsoft Edge.";
		
		String[] array = str.split(" ");
		System.out.println(array.length);
		
		DemoArray obj = new DemoArray();
		
//		obj.printStringArrayUsingBasicForLoop(array);
		
		
		String temp = str.replace(".", "").replace(",", "");
//		String temp = str.replaceAll(".", "*");
		System.out.println(temp);
		
		String arr[] = temp.split(" ");
		obj.printStringArrayUsingBasicForLoop(arr);
		
//		String abc = " .,";
//		String[] arr1 = str.split(abc);
//		obj.printStringArrayUsingBasicForLoop(arr1);
		
		
//		String str10="[,\\.\\s $ \\[/, *]";
//		
//		String str5="y[*u$g$a .nd,h//ar";
//		
//		String[] arr=str5.split(str10);
//		for (String a:arr)
//		System.out.println(a);
	
	}
	
	public static void reverseAllWordsInASentence() {
		String str = "Built by Microsoft, Playwright is a Node.js library that, with a single API, automates Chromium, Firefox, and WebKit. These APIs can be used by developers writing JavaScript code to create new browser pages, navigate to URLs and then interact with elements on a page. In addition, since Microsoft Edge is built on the open-source Chromium web platform, Playwright can also automate Microsoft Edge.";
		
		String newString = str.replace(".", "").replace(", ", "");
		
		String[] arr = newString.split(" ");
		
		for(String each: arr) {
//			System.out.println(each);
			System.out.println(reverseAStringUsingCharAt(each));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
