package array;

import java.util.Scanner;

public class PracticeArray {
	public static void main(String[] args) {

		int[] testArray = { 10, 20, 30, 40 };
		CloneArray abc = new CloneArray();
		abc.cloneIntArray(testArray);
		
		int[] myArray = abc.cloneAndReturnIntArray(testArray);
		CreateGenericMethodsForPrintingArray obj = new CreateGenericMethodsForPrintingArray();
		obj.printIntArray(myArray);
		
		GetArrayFromUser obj1 = new GetArrayFromUser();
//		obj1.getIntArrayFromUser();
		
//		int[] userArray = obj1.getIntArrayFromUser(3);
//		System.out.println("Array values are ");
//		obj.printIntArray(userArray);
		
		ArrayIndexValue getIndex = new ArrayIndexValue();
		getIndex.getGivenIndexValueFromAnIntArray(testArray, 1);
	}
}

class CreateGenericMethodsForPrintingArray {

	public void writeArray() {
		int a[] = { 1, 2, 3, 4 };

		int b[] = { 2, 4, 6, 8 };

		String strArr[] = { "a", "b", "c" };

//	How to write a method to print an Array

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

		for (int s = 0; s < strArr.length; s++) {
			System.out.println(strArr[s]);
		}
	}

	public void printIntArray(int[] givenArray) {
		for (int i = 0; i < givenArray.length; i++) {
			System.out.println(givenArray[i]);
		}
	}

	public void printIntArray(String[] givenArray) {
		for (int i = 0; i < givenArray.length; i++) {
			System.out.println(givenArray[i]);
		}
	}
}

class CreateGenericMethodToGetArrayLength {

	public void writeArray() {
		int a[] = { 1, 2, 3, 4 };

		int b[] = { 2, 4, 6, 8 };

		String strArr[] = { "a", "b", "c" };

		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(strArr.length);
	}

	public void getArrayLength(int a[]) {
		System.out.println(a.length);
	}

	public int returnGivenArraylength(int a[]) {
		System.out.println(a.length);
		return a.length;
	}

}

class CloneArray {
	public void writeArray() {
		int a[] = { 1, 2, 3, 4 };

		int b[] = { 2, 4, 6, 8 };

		String strArr[] = { "a", "b", "c" };

		int clonedArray[] = a.clone();
		int clonedArray1[] = b.clone();
		String clonedArray2[] = strArr.clone();

	}

	public void cloneIntArray(int[] a) {
		int clonedArray[] = a.clone();

		CreateGenericMethodToGetArrayLength len = new CreateGenericMethodToGetArrayLength();
		len.getArrayLength(clonedArray);

		CreateGenericMethodsForPrintingArray print = new CreateGenericMethodsForPrintingArray();
		print.printIntArray(a);
	}

	public int[] cloneAndReturnIntArray(int[] a) {
		int clonedArray[] = a.clone();
		return clonedArray;
	}
}

class GetArrayFromUser {
	
	
	public void getIntArrayFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter int array size: ");

		int arrayS = scan.nextInt();
		
		int arr[] = new int[arrayS];

		System.out.println("Please enter " + arrayS + " numbers");

		for (int i = 0; i < arrayS; i++) {
			arr[i] = scan.nextInt();
		} 
		
		System.out.println("User provided int array values are ");
		CreateGenericMethodsForPrintingArray print = new CreateGenericMethodsForPrintingArray();
		print.printIntArray(arr);

	}

	public int[] getIntArrayFromUser(int arrayLength) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter " + arrayLength + " numbers");

		int arr[] = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scan.nextInt();
		}

		return arr;
	}
}

class ArrayIndexValue {
	
	public void writeArray() {
		int a[] = { 1, 2, 3, 4 };

		int b[] = { 2, 4, 6, 8 };

		String strArr[] = { "a", "b", "c" };

		System.out.println(a[1]);
		System.out.println(b[2]);
		System.out.println(strArr[0]);

	}
	
	public int getGivenIndexValueFromAnIntArray(int[] arr, int index) {
		System.out.println("Value present in given array at the "+ index + "is : " +arr[index]);
		return arr[index];
	}
	
	public int getIntArrayFromUserAndReturnAnIndexValue(int arrayLength, int index) {
		GetArrayFromUser obj = new GetArrayFromUser();
		int[] testArray = obj.getIntArrayFromUser(arrayLength);

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




















