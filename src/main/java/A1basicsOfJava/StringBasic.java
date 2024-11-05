package A1basicsOfJava;

//* String is "Sequence of character" (Basic Explanation)
//* In Java, It is array of character
//* In Java, String is a non- primitive data type
//* In Java String is a Class also
//* Why it is class, because we can perform many operations on String
//* if my String is "Sathya", length - 6, index starts with 0. Then last index is 5 or I can say length -1;
//
//How do we define String
//
//String str = "Raj"; - Literals 
//String str1 = new String("Ranjith"); - Instance or object creation
//

//* How do we store a String in Java
//	* String literals
//	* String object




public class StringBasic {
	
	int c;//declaration
	
	StringBasic xyz;//declaration
	
	static StringBasic cd; //declaration
	
	public static void main(String[] args) {
		
	
	String str = "Sathya";
	String str2 = "Sathya"+"Moorthi";//concatination
	String str6 = str + "Moorthi";
	String str7 = new String("Sathya");
	
	String strA = "";//empty
	String strB = "      "; //blank
	String strC = "11";
	String strD = "Hello My World";
	String strE = "Hello World, My name is \"Sathya\"";
//	String strE = "Hello World, this is \"Sathya\"";
	System.out.println(strE);
	
	String str1 = "* if my String is "+"Sathya"+", length - 6, index starts with 0. Then last index is 5 or I can say length -1;";
	String str3 = "* if my String is \"Sathya\", length - 6, index starts with 0. Then last index is 5 or I can say length -1;";
	
	System.out.println(str);
	System.out.println(str2);
	System.out.println(str1);
	System.out.println(str3);
	
	String ss = "Sathiyamoorthi";
	//Sathiya"m"oorthi
	String ss1 = "Sathiya\"m\"oorthi"; 
	System.out.println(ss1);
	
	String abc = null;
	System.out.println(abc);
	
	StringBasic obj = new StringBasic(); //Object creation //declaration + initialization
	int a = 20;//declaration + initialization
	
	System.out.println(obj.c);
	
	System.out.println(obj.xyz);
	
	obj.c = 20; //initialization
	System.out.println(obj.c);
	obj.xyz = new StringBasic();//initialization
	
	cd = new StringBasic();
	
	obj.method1();
	
	System.out.println(obj.c);
	
	
	}
	
	public void method1() {
//		cd = new StringBasic();
//		StringBasic obj = new StringBasic();
		System.out.println(cd.c);
	}
	

}
