package arrayCodingPractice;

import array.ArrayLearning;

public class ArrPractice1 {

	public static void main(String[] args) {
		int array[] = { 10, 50, 30, 20, 40 };
//		arr.

//		swappingTwoNumbers();

//		swappingOfTwoNumbersWithoutTempVariable();
		
//		sortingAnArray(array);
		
//		System.out.println("Original array");
//		ArrayLearning obj = new ArrayLearning();
//		obj.printArrayValuesUsingBasicForLoop(array);
//		
//		reverseAnArray(array);
		
		reverseSortAnArray(array);

	}
	
	public static void reverseSortAnArray(int[] ar) {
		sortingAnArray(ar);
		reverseAnArray(ar);
	}
	
	
	
	public static void reverseAnArray(int[] ar) {
//		int lastIndex = ar.length -1;
		
		System.out.println("Reversed array");
		for(int i = ar.length-1; i>=0;i-- ) {
			System.out.println(ar[i]);
		}
	}

	public static void sortingAnArray(int[] ar) {
//		int ar[] = { 10, 50, 30, 20, 40 };

//		From array we can one value at a time
//		We can access values by using index
//
//		First iteration - i = 0;
//		{10, 50, 30, 20, 40};
//
//		second iteration - i = 1; a[1] = 50
//		{10, 50, 30, 20, 40};
//		{10, 30, 50, 20, 40}; a[1] = 30
//		{10, 20, 50, 30, 40}; a[1] = 30
//
//		Third iteration - i = 2; a[2] = 50
//		{10, 20, 50, 30, 40};
//		{10, 20, 30, 50, 40}; a[2] = 30
//
//		Fourth iteration - i = 3; a[3] = 50
//		{10, 20, 30, 50, 40};
//		{10, 20, 30, 40, 50}; 
		
		ArrayLearning obj = new ArrayLearning();
		obj.printArrayValuesUsingBasicForLoop(ar);

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				int temp = 0;
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println("Sorted array");
		obj.printArrayValuesUsingBasicForLoop(ar);
	}

	public static void swappingTwoNumbers() {
		int a = 10;
		int b = 20;

		System.out.println("Variable a value is: " + a);
		System.out.println("Variable b value is: " + b);

//		a = b; // a = 20;
//		b = a; // b = 20;

		int temp = a; // temp = 10;
		a = b; // a = 20;
		b = temp; // b = 10

		System.out.println("Variable a value is: " + a);
		System.out.println("Variable b value is: " + b);

	}

	public static void swappingOfTwoNumbersWithoutTempVariable() {

		int a = 10;
		int b = 20;

		System.out.println("Variable a value is: " + a);
		System.out.println("Variable b value is: " + b);

		a = a + b; // a = 30;

		// a = 30 and b = 20;

		b = a - b; // 30 - 20; b = 10;

		a = a - b; // 30 - 10; a = 20;

		System.out.println("Variable a value is: " + a);
		System.out.println("Variable b value is: " + b);

	}

}
