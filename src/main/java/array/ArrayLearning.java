package array;

import java.util.Scanner;

public class ArrayLearning {

	public static void main(String[] args) {
		ArrayLearning obj = new ArrayLearning();
		
		obj.arrayBasics();

		int arr2[] = { 11, 22, 33, 44, 55 };
//		obj.getGivenIndexValueFromArray(arr2, 4);
//
//		obj.validateTheGivenValuePresentInTheArray(arr2, 440);
//		
//		obj.getIndexOfTheGivenValueFromArray(arr2, 440);
		
		
//		obj.getIntArrayFromUser();
		
		obj.getIntArrayFromUser(3);
	}

	public void arrayBasics() {

		ArrayLearning obj = new ArrayLearning();

		int a = 10;
		System.out.println(a);

//		int arr[] = new int[5];
		int[] arr = new int[5]; // declaration

		arr[0] = 10;// initialization
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60;

		System.out.println(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println("Length of the array is: " + arr.length);

		System.out.println("Getting array values using basic for loop: ");
//		for(int i = 0; i<5;i++) {
//		for(int i = 1; i<=arr.length;i++) {
//		for(int i = 0; i<=arr.length-1;i++) {

//		for(int i = 0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		obj.printArrayValuesUsingBasicForLoop(arr);

		int arr1[] = new int[5];
		arr1[2] = 22;
		arr1[4] = 24;

//		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		obj.printArrayValuesUsingBasicForLoop(arr1);

		int arr2[] = { 11, 22, 33, 44, 55 };

//		for(int i = 0; i<arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		obj.printArrayValuesUsingBasicForLoop(arr2);

		int[] clonedArray = arr2.clone();
		obj.printArrayValuesUsingBasicForLoop(clonedArray);

		String[] stringArr = { "A", "B", "C" };
		char[] charArr = { 'A', 'B', 'C', 'D' };
		obj.printArrayValuesUsingBasicForLoop(stringArr);
	}

	public void buySoap() {
		System.out.println("Buy Hamam soap");
	}

	public void buySoap(String soapName) {
		System.out.println("Buy " + soapName + " soap");
	}

	public void printArrayValuesUsingBasicForLoop(int[] arrayName) {
		System.out.println("Values in the array are: ");
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
	}

	public void printArrayValuesUsingBasicForLoop(String[] arrayName) {
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
	}

	public void printArrayValuesUsingBasicForLoop(char[] arrayName) {
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
	}

	public int getGivenIndexValueFromArray(int[] arrayName, int index) {
		System.out.println(arrayName[index]);
		return arrayName[index];
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
		printArrayValuesUsingBasicForLoop(ar2);
	}

	public int[] returnAnIntArray() {
		int zen[] = { 1, 2, 3, 4, 5 };
		System.out.println(zen.length);
		return zen;
	}


	public void getIndexOfTheGivenValueFromArray(int[] arrayName, int value) {

//		psudocode 
//		By using for loop iterate through the array
//		within the for loop use if condition to check whether the given value is present in the array
//		if the array iteration value is equals to given value
//		then return the index of the array and break the loop

		printArrayValuesUsingBasicForLoop(arrayName);

		boolean flag = false;
		
		int i;
		for (i = 0; i < arrayName.length; i++) {
			if (arrayName[i] == value) {
				flag = true;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("The given value " + value + " is present in the array index of: " + i);
		}
		else
			System.out.println("The given value " + value + " is NOT present in the array");
	}

	public void validateTheGivenValuePresentInTheArray(int[] arrayName, int value) {

		printArrayValuesUsingBasicForLoop(arrayName);

		int temp = 0;
		for (int i = 0; i < arrayName.length; i++) {
			if (arrayName[i] == value) {
				temp = 1;
				break;
			}

		}
		if (temp == 1) {
			System.out.println("The given value " + value + " is present in the array");
		} else
			System.out.println("The given value " + value + " is NOT present in the array");
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
		printArrayValuesUsingBasicForLoop(arr);
	}
	
	public int[] getIntArrayFromUser(int arrayLength) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter " + arrayLength + " numbers");

		int arr[] = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scan.nextInt();
		}

		printArrayValuesUsingBasicForLoop(arr);

		return arr;
	}


}
