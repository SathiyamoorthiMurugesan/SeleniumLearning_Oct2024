package string;

public class StringLearning {
	
/*
 * Questions based on a string
 * 	"Sathiyamoorthi" 
 *  "String class provides us many useful methods to validate a string/word/sentence"
 *  "5345354"
 *  "murugesansathiyamoorthi@gmail.com"
 *  "" - empty
 *  "          " - blank
 *  null
 *  
 *  
 *  Sathiya"Moor"thi - value
 *  convert to String
 *  String str = "Sathiya"Moor"thi";
 *  String str = "Sathiya\"Moor\"thi";

	Is this String
	1. equals to Saraswathi or SATHIYAMOORTHI or sathiyamoorthi
	2. upper case 
	3. lower case
	4. contains spaces (front or back or between)
	5. length > some number
	6. vowels
	7. duplicate letters
	8. blank
	9. empty
	10. contains any other string
	11. contains expression
	12. contains any specific letter
	13. contains space, then how to remove
	14. index based question
 */
	
//	* In General, String is sequence of characters or array of characters
//	* In java, String is a class and non-primitive data type
//	* String class(is also a utility class) provides us many useful methods to validate a string/word/sentence
//	* Like Java, String is case sensitive (Shiva and shiva are different)
//	* String class is final in java. Hence we can not inherit it
//	* String can be defined in two ways
//		1) String literals
//			String str = "Sathya";
//			str - varibale name, it is stored in stack memory
//			Object - "Sathya" - is stored in "String constant pool (SCP)" section of Heap memory
//		2) By creating object 
//			String str = new String("Shiva");
//			Object - "Shiva" is stored in Heap memory as regular object values.
//	* In java, Strings are immutable
//		Why - 
	
	/*
	
	length()
	isEmpty()
	charAt(index)
	equals()
	equalsIgnoreCase()
	contentEquals()  
	compareTo()
	compareToIgnoreCase()
	startsWith()
	endsWith()
	hashCode()
	indexOf()
	lastIndexOf()
	substring()
	subSequence()
	concat()
	replace()
	matches()
	contains()
	split()
	join()
	toLowerCase()
	toUpperCase()
	trim()
	strip()
	stripLeading()
	stripTrailing()
	isBlank()
	toString()
	toCharArray()
	format()
	valueOf()
	repeat()
*/
	
	public int getStringLength(String str) {
		System.out.println(str.length());
		return str.length();
	}
	
	public void practiceLengthMethod() {
		String str = "Sathya";
		System.out.println(str.length());
		
		String str1 = "    ";
		System.out.println(str1.length());
		
		String str2  = "";
		System.out.println(str2.length());
		
		String str3 = "In General, String is sequence of characters or array of characters";
		System.out.println(str3.length());
	}
	
	
	
	public static void main(String[] args) {
		String str = "Sathya"; 
		String str1 = "Sathya";
		String str2 = "SATHYA";
		String str3 = "Shiva";
		
		
//		How to get size or length of a String
//		System.out.println(str.length());
		System.out.println("**Length**");
		int length = str.length();
		System.out.println(length);
		
		
//		How to check a String is empty or not
		System.out.println("**isEmpty**");
		System.out.println(str.isEmpty());
		boolean empty = str.isEmpty();
		System.out.println(empty);
		
//		How to get a particular character(letter) value
		System.out.println("**charAt**");
		System.out.println(str.charAt(3));
		char ch = str.charAt(5);
		System.out.println(ch);
//		str.charAt(6); // StringIndexOutOfBoundsException - If we are passing a greater index value,then we will get this exception
		
//		To check if two Strings are equal.This is boolean. This checks case sensitivity(lower and upper case)
//		Will return True - if the value matches exactly
//				False - if it does not match
		System.out.println("**equals**");
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		
//		equalsIgnoreCase - similar to equals(). but this does not check case sensitivity(lower and upper case)
		System.out.println("**equalsIgnoreCase**");
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.equalsIgnoreCase(str3));
		
//		contentEquals() - yet to check
		
//		compareTo() - Compares two Strings and returns positive,negative or 0
//		Returns an integer value
//			if s1 > s2, it returns positive number  
//			if s1 < s2, it returns negative number  
//			if s1 == s2, it returns 0  
//		ClassCastException: If this object cannot get compared with the specified object.
//		NullPointerException: If the specified object is null.
		System.out.println("**compareTo**");
		String s1 = "Hi this is Shiva";
		String s2 = "hi this is Shiva";
		String s3 = "Me this is Shiva";
		String s4 = "Hi this is Shiva";
		String s5 = "hi this is Shiva";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareTo(s4));
		System.out.println(s2.compareTo(s5));
		
//		compareToIgnoreCase() - Similar to compareTo(), but this ignores case differences(lower and upper case)
		System.out.println("**compareToIgnoreCase**");
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s3.compareToIgnoreCase(s1));
		
//		startsWith() - checks if this string starts with the given prefix. xx`
//		It returns true if this string starts with the given prefix; else returns false.
		System.out.println("**startsWith**");
		String a = "Java Learning";
		System.out.println(a.startsWith("Ja"));
		System.out.println(a.startsWith("ja"));
		System.out.println(a.startsWith("Java"));
		System.out.println(a.startsWith("Java learning"));
		
//		endsWith() - checks if this string ends with a given suffix.
//		It returns true if this string ends with the given suffix; else returns false.
		System.out.println("**endsWith**");
		System.out.println(a.endsWith("g"));
		System.out.println(a.endsWith("G"));
		System.out.println(a.endsWith("ing"));
		System.out.println(a.endsWith("Learning"));
		
//		hashCode() - yet to check
		
//		indexOf() - returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("**indexOf**");
		String z = "this is Shiva";
		int index1 = z.indexOf("S");
		System.out.println(index1);
		int index2 = z.indexOf("is"); //returns the index of is substring  
		System.out.println(index2);
		int index3=z.indexOf("is",7);//returns the index of is substring after 4th index  
		System.out.println(index3);
		System.out.println(z.indexOf("Sathya"));
		System.out.println(z.indexOf('S'));
		System.out.println(z.indexOf('z'));
		
//		lastIndexOf() - returns the last index of the given character value or substring.
//		If it is not found, it returns -1. The index counter starts from zero.
		System.out.println("**lastIndexOf**");
		String z1 = "my name is Shiva";
		int index4 = z1.lastIndexOf("S");
		System.out.println(index4);
		System.out.println(z1.lastIndexOf("is"));
		int index5 = z1.lastIndexOf("e",7);  
        System.out.println(index5); // returns the index of the value 's' before the 5th index, which is 3
        int index6 = z1.lastIndexOf("name");
		System.out.println(index6);
		int index7 = z1.lastIndexOf("is",13);
		System.out.println(index7);
		int index8 = z1.lastIndexOf("is",5);
		System.out.println(index8); //-1 , because value is not found before 5th index
		
//		substring() - A part of String is called substring. In other words, substring is a subset of another String.
//		In case of substring() method startIndex is inclusive and endIndex is exclusive.
//		startIndex: inclusive
//		endIndex: exclusive
		System.out.println("**substring**");
		String d ="hello";    
		System.out.println(d.substring(0,2)); //returns he  as a substring, 
//		0 points the first letter and 2 points the second letter i.e., e (because end index is exclusive).
		String c = "Shiva Prakash";
		System.out.println(c.substring(6));
		System.out.println(c.substring(0,6));
		
//		subSequence() - returns a new character sequence that is a subsequence of this sequence.
		System.out.println("**subSequence**");
		String v = "my name is Shiva";
		System.out.println(v.subSequence(0,7));
		System.out.println(v.subSequence(11,16));
		
//		concat() - String concatenation forms a new String that is the combination of multiple strings. 
//		There are two ways to concatenate strings in Java:
//			By + (String concatenation) operator
//			By concat() method
		System.out.println("**concat**");
		String f = "Shiva";
		String g = "Prakash";
		String m1 = " ";
		System.out.println(f+g);
		System.out.println(f.concat(g));
		System.out.println(f.concat(f));
		System.out.println(m1.concat(f));
		System.out.println(m1.concat(m1));
		
//		replace() - replaces the character or String
		System.out.println("**replace**");
		String h = "my name is english";
		System.out.println(h.replace('e','a'));
		System.out.println(h.replace("is","was"));
		
//		matches() - yet to check
		
//		contains() - searches the sequence of characters in this string.
//		It returns true if the sequence of char values is found in this string otherwise returns false.
		System.out.println("**contains**");
        System.out.println(v.contains("name"));
        System.out.println(v.contains("is Shiva"));
        System.out.println(v.contains("was"));

//		split() - yet to check
		
//      join() - yet to check
        
//      toLowerCase() - returns the string in lowercase letter.
//      In other words, it converts all characters of the string into lower case letter.
        System.out.println("**toLowerCase**");
        String m = "SHIVA PRAkash";
        System.out.println(m.toLowerCase());
        
//      toUpperCase() - returns the string in uppercase letter.
//      In other words, it converts all characters of the string into upper case letter.
        System.out.println("**toUpperCase**");
        String m3 = "shiva praKASH";
        System.out.println(m3.toUpperCase());
        
//      trim() - eliminates leading and trailing spaces
        System.out.println("**trim**");
        String n = "  shiva      prakash   ";
        System.out.println(n.trim());
        
//      strip() - removes all leading and trailing white space and returns a new string
//      stripLeading() - Returns a new string with all leading white spaces is removed
//      stripTrailing() - Used to remove white spaces only at the ending of a string.
        System.out.println("**strip/stripLeading/stripTrailing**");
        String k = "  shiva      prakash   ";
        System.out.println(k.strip());
        System.out.println(k.stripLeading());
        System.out.println(k.stripTrailing());
        
//      isBlank() - returns true/false
//      D/B isEmpty() and isBlank():
//        	isEmpty() - Returns true if it is empty(white spaces not included), else false
//        	isBlank() - Returns true if it is blank and also has only white spaces, else false
        System.out.println("**isBlank**");
        String p = " ";
        String p1 = "";
        String p2 = "shiva";
        System.out.println(p.isBlank());
        System.out.println(p.isEmpty());
        System.out.println(p1.isBlank());
        System.out.println(p1.isEmpty());
        System.out.println(p2.isBlank());
        System.out.println(p2.isEmpty());
        


//        str1.replaceAll("Hello", ""); //  Tamil
//
//        str1.contains(str);
//
//        int a = str.indexOf("m"); //2
//
//        char any = str.charAt(1); //a
//
//        char[] abc = str.toCharArray();
//        char[] abc = {'T', 'a', 'm', 'i', 'l'};
//
//        String[] arr = str.split("mi");
//        String[] arr = {"Ta", "l"}
        	

        
        

	}

}
