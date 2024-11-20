package array;

import java.util.Arrays;

//* Arrays is a utility class to manipulate array or arrays
//* Arrays class has only one constructor which is private. So we cant create object for this class.
//* Since Arrays constructor is private, all the methods in this class are created as static
//* Important methods of Arrays Class
//		* sort(arrayName);
//		* sort(arrayName, startIndex, endIndex);
//		* parallelSort();
//		* equals(array1, array2);
//		* compare(array1, array2);
//		* copyOf(arrayName, length);
//		* copyOfRange(arrayName, startIndex, endIndex);
//		* fill(arrayName, valueToBeFilled);
//		* mismatch(array1, array2);

public class TestingArrays {

	public static void main(String[] args) {
		
//		Arrays obj = new Arrays();
		
		int ar[] = {10, 50, 30, 20, 40};
		
//		String
		
		DemoArray obj = new DemoArray();
		obj.printIntArrayUsingForEach(ar);
		
//		Arrays.sort(ar);
//		obj.printIntArrayUsingForEach(ar);
		
		
//		Arrays.sort(ar, 1, 4);
//		Arrays.sort(ar, 3, 5);
//		Arrays.sort(ar, 3, 6);
//		obj.printIntArrayUsingForEach(ar);
		
		int ar1[] = {10, 50, 30, 20, 40};
		int ar2[] = {10, 20, 30, 40, 50};
		int ar3[] = {10, 20, 30, 40, 50};
		int ar4[] = {30, 20};
		int ar5[] = {20, 30, 50};
		
		System.out.println("********equals*************");
		boolean checkTwoArraysAreEqual = Arrays.equals(ar1, ar2);
		System.out.println(checkTwoArraysAreEqual);
		
		
		System.out.println("********compare*************");
		System.out.println(Arrays.compare(ar3, ar2));
		System.out.println(Arrays.compare(ar1, ar2));
		System.out.println(Arrays.compare(ar4, ar5));
		
		System.out.println("********copyOf*************");
		int[] copiedArray = Arrays.copyOf(ar1, 3);
		obj.printIntArrayUsingForEach(copiedArray);
		
		
		System.out.println("********copyOfRange*************");
		int[] copiedArrayWithRange = Arrays.copyOfRange(ar1, 1, 4);
		obj.printIntArrayUsingForEach(copiedArrayWithRange);
		
		
		System.out.println("********fill*************");
		Arrays.fill(ar1, 100);
		obj.printIntArrayUsingForEach(ar1);
		
		System.out.println("********mismatch*************");
		System.out.println(Arrays.mismatch(ar1, ar2));
		
		
		
	}
	
	
	
	public void reverseAnArray() {

		int ar[] = {10, 50, 30, 20, 40};
//		50,  40, 30, 20, 10
		
		for(int i = ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
	
	}

}
