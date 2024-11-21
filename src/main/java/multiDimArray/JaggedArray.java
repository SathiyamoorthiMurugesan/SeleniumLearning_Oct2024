package multiDimArray;

import java.util.Arrays;

public class JaggedArray {
	
//	* Jagged array is nothing but, arrays of arrays but each arrays can have different column values
//	* In Jagged array, length is nothing but total rows
//	* We can not declare Jagged array as same as MultiDimentional array. We need to initialize jagged array while declaring itself.
//		* Because in multiDimentional array, column size is same across the arrays
//		* But in Jagged array, column size of each array may vary
//	* We can print jagged array by using for loops only. 
//	* We can not simply use sysout or Arrays class methods to print jagged array

	public static void main(String[] args) {
		
		String arr1[] = {"Sathya", "Gopal", "Sekar", "Bala"};
		String arr2[] = {"Shiva", "Tamil"};
		String arr3[] = {"Syed", "Sasi", "Ragul"};
		
		String arr4[][] = {arr1, arr3, arr2 };
		
//		String abc[][] = new String[2][2];
//		String batchMates[][] = new String[3][?];
		String batchMates[][] = {
				{"Sathya", "Gopal", "Sekar", "Bala"},
				{"Shiva", "Tamil"},
				{"Syed", "Sasi", "Ragul"}
		};
		System.out.println(batchMates.length);
		System.out.println(batchMates[2].length);
		
//		System.out.println(batchMates);
//		System.out.println(Arrays.toString(batchMates));
		
		for(String[] eachBatchMates:batchMates) {
			System.out.println(Arrays.toString(eachBatchMates));
		}
		
		for(int i=0; i<batchMates.length;i++) {
			for(int j=0;j<batchMates[i].length;j++) {
				System.out.println(batchMates[i][j]);
			}
		}
	}

}
