package A1basicsOfJava;

public class StringImmutable {
	
/*
  
  Immutable concept 
  It happens with String literals
 
String str = "Sathya";
String str1 = "Sathya";
String str2 = "Ranjith";

stack 		SCP
str			"Sathya" - 
str1 		
str2 		Ranjith

str1 = str1 + str2;
str1 = SathyaRanjith

str - Sathya - SathyaRanjith


stack 		SCP
str			"Sathya" - 
str1 		SathyaRanjith
str2 		Ranjith

str = str + "abc"

stack 		SCP
str			"Sathyaabc" ("Sathya" obj is left alone in SCP)
str1 		SathyaRanjith
str2 		Ranjith

			
String a = "new"; // memory location of new in SCP is 00;
a = a+"10";
a = new10; //memory location of new10 in SCP is 01; and "a" from Stack memory will point to this location.

* Now the "new" in SCP is not assigned to any variable in stack. 
* "new" - String object is not used by anyone;
* Unused objects in java is cleared by Garbage collector.

 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
