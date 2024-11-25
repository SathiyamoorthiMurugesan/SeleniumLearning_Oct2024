package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListHashSetPrograms {

	public static void main(String[] args) {
//		How to convert an array into ArrayList

		int[] ar = new int[] { 1, 3, 2, 10, 4 };
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("elements in the array are: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			Integer value = Integer.valueOf(ar[i]);
			list.add(value);
		}
		System.out.println("elements in the ArrayList are: ");
		System.out.println(list);
		
		System.out.println("Converting arrayList to array");
//		Object[] obj = list.toArray();
//		Integer[] array = (Integer[]) list.toArray();
		Object[] array = list.toArray();
		
//		How to convert Object into Integer?
		for(Object each: array) {
			System.out.println(each);
		}
		

//		List<int[]> list = Arrays.asList(ar);
//		System.out.println(list);
		System.out.println("****************************************************************");
		Integer[] ar1 = new Integer[] { 1, 3, 2, 10, 4 };
//		Integer val1 = new Integer(1);
//		Integer val2 = new Integer(3);
//		Integer val3 = new Integer(2);
//		Integer val4 = new Integer(10);
//		Integer val5 = new Integer(4);

		System.out.println("elements in the array are: ");
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}

		List<Integer> list1 = Arrays.asList(ar1);
		System.out.println(list1);
		
		System.out.println("Lambda expression");
		list.forEach(eachValue -> System.out.println(eachValue));

	}

}
