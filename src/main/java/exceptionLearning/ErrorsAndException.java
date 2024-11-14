//* Error - If error happens, execution will stop. Errors should not be handled, it should be fixed.  
//		* Errors can be runtime error, or compile time error.
//		* Complile time error - if we do not follow java coding standards we get compile time error. 
//			* IDE itself let us know the errors while writing
//			* Only after fixing it, we can run the code 
//			* eg: declaring a variable without data type. 
//		* Run time error - It does not captured during compile time. 
//			* eg: trying to run a code without main method
//			* trying to get string value from a numeric cell of an excel 

//* Exception - An exception is an unwanted or unexpected event, which occurs during the execution of a program; 
//* i.e at run time, Exception disrupts the normal flow of the program�s instructions.
//		* If Exception is not handled, program will not continue.
//		* Exception needs to handled. So that, other line of codes will execute as usual
//		* To handle an exception, we use try and catch blocks
//	* In Java, Exception is a class and its extends Throwable class. 
//	* eg: for exception - RunTimeException(ArithmaticException), IOException, SQLException, NullPointerException, FileNotFoundException
//	* All the above exceptions extends to --> Exception class --> Throwable class
// 	* RunTime Exceptions needs to be handled with try catch block, such as Arithmatic Exception, Nullpointer Exception
//	* Whatever the code causing the error should be present in try block
//	* The exception in try block code needs to be caught in catch block
//	* A single try block can have multiple catch block
//	* Its always good practice to put exact exception as catch block at first place, then put exception class as a catch in next catch block
//	* If try block get executed and throws an exception, then respective catch block will be executed
//	* If try block get executed and throws an exception but we did not put respective exception catch block, that time parent exception catch block will run
//	* Whether catch block executed or not, finally block will get executed after try block
//	* All the method we use in the catch block are implemented in parent class of Exception which is "Throwable" class
//	* Whenever we create a catch block, we create an object for the respective exception; and by using the object, we access the methods	
//	* Finally block should always be at the end (after all the catch blocks)

// 	* how to use try, catch and finally block
//	1) we can not use try block alone;
//	2) if we use try alone, we need to completed it with finally block (try, finally)
//	3) try, catch alone
//	4) try, catch, catch, etc... 
//	5) try, catch, finally
//	6) try, catch, catch, etc... finally
//	7) we can not use finally alone
//	8) try should not be alone, it should be associated with either catch or finally or catches or catch AND finally or catches  AND finally.

//* Exception Hirarchy: https://www.javatpoint.com/exception-handling-in-java

package exceptionLearning;

public class ErrorsAndException {

	public static void main(String[] args) {
		ErrorsAndException obj = new ErrorsAndException();
//		obj.method1(10, 0);
		System.out.println("Hello");
//		ErrorsAndException obj1 = new ErrorsAndException();
//		
////		obj.method1(10, 0);
//		
		try {
			obj.method1(10, 0);
//			obj1 = null;
//			System.out.println(obj1.method1(10, 2));
		} 
		
		catch(Exception e) {
			System.out.println("I am parent Exception");
			System.out.println(e.getMessage());
		}
		System.out.println("hiii");
//		
//		catch (ArithmeticException e) {
//			System.out.println("I am arithmetic exception");
////			e.printStackTrace();
//			String abc = e.getMessage();
//			System.out.println(abc);
//			obj.method1(10, 2);
//		}
//		
//		catch(NullPointerException e) {
//			System.out.println("I am null pointer exception");
//			System.out.println(e.getMessage());
//		}
//		
//		catch(Exception e) {
//			System.out.println("I am parent Exception");
//			System.out.println(e.getMessage());
//		}
//		
//		finally {
//			System.out.println("I am finally");
//		}
//		
//		System.out.println("Hiiiiiiiiii");
//		
	}
	
	public int method1(int a, int b) {
		System.out.println(a/b);
		return 0;
	}

}