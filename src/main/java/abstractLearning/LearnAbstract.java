
 package abstractLearning;

public class LearnAbstract {

	/*
	 * Abstract is a Class, its not an interface. abstract class should be created with keyword 'abstract'
	 * It is not mandatory to have an abstract method in an Abstract class
	 * We can create either abstract methods or concrete methods or both the methods in abstract Class.
	 * In normal class, we can not create  abstract methods
	 * The moment we create an abstract method in a class, the class will be converted into abstract Class
	 * We can not create object for abstract class. Because abstract Class may have abstract methods alone and 
	 * 		in that situation, object creation is useless
	 * Whenever, a Class, follows(extends) an abstract class, it will prompt to implement the unimplemented methods
	 * But if an abstract class follows an interface it will NOT prompt to implement the unimplemented methods.
	 * To use non static method of Abstract class in some other class, 
	 * 	1) That class should extend the abstract class
	 * 	2) create object for that class
	 * 	3) using that object, you can call the non static method of the abstract class 
	 * To use static method of an abstract class in some other class
	 * 	1) you can either extend or not that class to abstract class
	 * 	2) using that abstract class name, you can call the static method of the abstract class
	 * You can also create any kind of variables in abstract class
	 * You can not create abstract static method 
	 */
	
//	Assume
//	1. interface1 has bodyLessMethod1
//	2. abstractClass1 has bodylessMethod2 and bodyMethod2
//	3. TestClass1 has bodyMethod3
//	4. TestClass2 has bodyMethod4
//	5. TestClass1 "implements" interface1
//		* In TestClass1, we need to implement bodyLessMethod1
//	6. TestClass2 "extends" AbstractClass1
//		* In TestClass2, we need to implement bodyLessMethod2
//	7. abstractClass1 "implements" interface1
//		* Now, we dont need to implement bodyLessMethod1 in abstractClass1.
//	8. As we already know, TestClass2 "extends" to AbstractClass1 which "implements" interface1
//		* So, in TestClass2, we need to implement bodyLessMethod1 and bodyLessMethod2
//		* If we create Object for TestClass2:
//			By using that object, we can also call "whatever non static methods in parent class or interface"

	public static void main(String[] args) {

	}

}
