  //	* Container object that holds the fixed number of values of a same datatype
//	* In Java, array is a non primitive data type
//	* It also holds String (non-primitive data type), primitive data type, classes, Objects
//	* Array index always starts with zero
//	* We declare array with below values 
//		* int a = 10;
//		* int arr[] = new int[5]; 
//			OR int[] arr = new int[5];
//				* arr[0] = 1;
//				* arr[1] = 2;
//				* 
//				* 
//				* arr[4] = 5;
//			OR int[] arr = new int[] {1, 2, 3, 4, 5};
//			OR int arr[] = new int[] {1, 2, 3, 4, 5};
//			OR int arr[] = {1, 2, 3, 4, 5};
//			OR int[] arr = {1, 2, 3, 4, 5};
//		* int - daya type
//		* [] - array
//		* arr - array variable name
//		* new - key word in java
//		* 5 - length

//* If we declare array with size 4 and initialize only 3 values then 4th value would be default value of that array data type. 
//		if its int array, 4th value 0
//		if its String array, then null

//	* We can not directly sysout array. For that, we need to use either Arrays class or for loops
//		* Arrays is a pre-defined class in Java.
//		* It contains many static methods to manipulate and access array elements

//	* user defined array variable provides us, clone method and length variable
//		* clone method - helps us to copy an array
//		* length variable is used to get the size of the array

package array;

import java.util.Scanner;

public class DemoArray {
	
	static int a = 10;
	
	int[] arr1 = {1, 2, 3, 4, 5};

	public static void main(String[] args) {
		DemoArray obj = new DemoArray();
//		obj.arrayPractice();
		
//		obj.cloneIntArray(obj.arr1);
		
//		obj.getIntArrayFromUser();
		
		obj.getIntArrayFromUserAndReturnAnIndexValue(3, 3);
		
	}
	
	
	
	

	public void arrayPractice() {

//		int ar = 10;
		String aa[] = new String[2];
//		aa.
 		
		int[] ar = new int[3];
//		ar.
//		ar = {10, 20, 30};
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
//		ar[3] = 40;
//		ar[4] = 45;
//
		System.out.println(ar);
		
		System.out.println(ar.length);

		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i]);
			}
		
		int[] ar1 = new int[2];
		ar1[0] = 10;
		ar1[1] = 20;
		
		for(int i = 0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
			}
		
		System.out.println("***** CLONING****");
		int[] abc = ar1.clone();
		
		System.out.println(abc[1]);
		System.out.println(abc.length);
		
		printIntArrayUsingBasicForLoop(abc);
		
	}
	
	public void printIntArrayUsingBasicForLoop(int[] array) {
		System.out.println("Values in the array are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void printStringArrayUsingBasicForLoop(String[] array) {
		System.out.println("Values in the array are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void printCharArrayUsingBasicForLoop(char[] array) {
		System.out.println("Values in the array are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void printIntArrayUsingForEach(int[] arr) {
		for (int eachValue : arr) {
			System.out.println(eachValue);
		}
	}
	
	public void printAStringArrayUsingForEach(String[] array) {
		for (String eachValue : array) {
			System.out.println(eachValue);
		}
	}

	public void intArrayLength(int[] arr) {
		System.out.println(arr.length);
	}
	
	public int intArrayLength1(int[] arr) {
		System.out.println(arr.length);
		return arr.length;
	}

	public void cloneIntArray(int arr[]) {
		int ar2[] = arr.clone();
		System.out.println("Cloned array");
		printIntArrayUsingBasicForLoop(ar2);
	}

	public int[] returnAnIntArray() {
		int zen[] = { 1, 2, 3, 4, 5 };
		System.out.println(zen.length);
		return zen;
	}

	public void getIntArrayFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter int array size: ");

		int arrayS = scan.nextInt();
		
		int arr[] = new int[arrayS];

		System.out.println("Please enter " + arrayS + " numbers");
		
		
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();

		for (int i = 0; i < arrayS; i++) {
//			System.out.println("Please enter " + arr[i] + " numbers");
			arr[i] = scan.nextInt();
		} 

		System.out.println("This is the array you created");
		printIntArrayUsingBasicForLoop(arr);
	}

	public int[] getIntArrayFromUser(int arrayLength) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter " + arrayLength + " numbers");

		int arr[] = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scan.nextInt();
		}

		printIntArrayUsingBasicForLoop(arr);

		return arr;
	}

	public int returnSingleValueFromAnIntArray(int index) {
		int ar[] = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

		System.out.println(ar[index]);

		return ar[index];

	}

	public int getIntArrayFromUserAndReturnAnIndexValue(int arrayLength, int index) {
		int[] testArray = getIntArrayFromUser(arrayLength);

		try {
//			System.out.println(testArray[index]);
			return testArray[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error message: " + e.getMessage());
			System.out.println("index should be anything less than length " + arrayLength);
			return 0;
		}
//		return testArray[index];
	}
	

}
