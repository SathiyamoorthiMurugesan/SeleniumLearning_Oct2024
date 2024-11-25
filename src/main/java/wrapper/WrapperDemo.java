/*
 		* Why Java is not 100% OOPs language is because of primitive data types.	 
		* int, double, char, float, short, boolean, long, byte - all are primitive data types
		* means, they can hold a value but they are not having any inbuild methods.
		* Simply, datatypes are not Objects
		* Wrapper classes helps us to use primitive data type as Objects
		* int - Integer
		* char - Character
		* boolean - Boolean and so on.
		* int a = 5; primitive datatype
		* Integer a = 5; Object
		* Interger a = new Integer(5); its depricated.
		* 
		*/

//	Autoboxing: Automatic conversion of primitive types to their corresponding wrapper class objects.
//
//	Unboxing: Automatic conversion of wrapper class objects to their corresponding primitive types.
//
//	Collections: They enable primitives to be used in Java Collections (e.g., ArrayList, HashMap).
//
//	Utility Methods: Wrapper classes provide useful methods for converting between types, parsing strings, etc.
//
//	Nullability: Unlike primitives, wrapper classes can hold a null value, which can be useful in certain situations.
		

package wrapper;

public class WrapperDemo {



	public static void main(String[] args) {
		
		
		int a = 5; //primitive data type
		Integer a1 = 50; //Object
		System.out.println(a);
		System.out.println(a1);
//		a. - not going to show any methods 
//		a1. - it contains many methods
		
//		int a = null;
		Integer testNull = null;
		Integer test;
		
//		int to Integer coversion
//		Autoboxing 
		int abc = 10;
		Integer abc1 = abc;
		
//		Another way to do Autoboxing manually
		Integer abc2 = Integer.valueOf(abc);
		
//		Integer to int coversion
//		Unboxing
		Integer integerObject = 15; 
		int primitiveInt = integerObject;
//		Another way to do Autoboxing manually
		int primitiveInt1 = integerObject.intValue();
		
		Character ch = 'a';
		
		Integer a2 = new Integer(10);
		
//		int[] arr = new int[3];
		Integer[] intArray = new Integer[3];
		intArray[0]  = 1;
		intArray[1]  = 2;
		intArray[2]  = 3;
		
		String str = "10";
//		System.out.println(str>10);
		Integer a3 = new Integer(str);
		System.out.println(a3==10);
		
//		What is parsing
		
//		parseInt(int i);
		
//		intArray[0].compareTo(1)
		
		int b = 10;
		Integer s = Integer.valueOf(b);
		System.out.println(s);
		System.out.println(s.reverse(10));
		
//		StringBuilder
//		StringBuffer
		
		int rotate = 25;
		System.out.println(Integer.rotateLeft(primitiveInt1, 1));
		
	}


}
