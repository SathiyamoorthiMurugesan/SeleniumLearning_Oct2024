// * throw keyword we uses to throw an exception voluntarily which we predict during compile time itself
// * Whenever we throw an exception, the method associated needs to have throws keyword followed by respective Exception(eg: IOException)
//		or its super class(Exception).
// * We generally use throw keyword to throw custom created exceptions
// * All other exceptions except Runtime exceptions can be threw during compile time.
//		* means, we can not throw Exception which extends to RunTimeException class. 
//		* RunTimeExceptions need to be dealt with try catch blocks

//if we throw RunTime exception voluntarily, we dont need to add 'throws'

// Throwable is parent class of Exceptions and Errors;

//  The  Throwable class is the superclass of all errors and exceptions in the Java language. Only objects that are instances of this  class (or one of its subclasses) are thrown by the Java Virtual Machine or  can be thrown by the Java  throw statement. Similarly, only this class or one of its subclasses can be the argument type in a   catch clause.



package throwException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Throws {
	
	public void methodA() {
		try {
			System.out.println("Hello");
		}
		
		catch(ArithmeticException e) {
			System.out.println("");
		}
	}
	
	public void methodB() throws IOException {
		System.out.println("throw exception");
		throw new IOException();
	}
	
	public void readAFile() throws FileNotFoundException {
		FileReader reader = new FileReader("C:\\Users\\LENOVO\\git\\JavaProject_SelviAndYugendhar\\src\\main\\java\\exceptionLearning\\exception123.txt");
	}

//		public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
//	public static void main(String[] args) throws IOException, ClassNotFoundException {
//	public static void main(String[] args) throws IOException, Exception, ClassNotFoundException {
//	public static void main(String[] args) {
	public static void main(String[] args) throws Exception {
		

//		throw new IOException();
//		System.out.println("hello");

//		throw new ClassNotFoundException();

//		throw new SQLException();

//		throw new ArithmeticException();


		Throws obj = new Throws();
		
		
		obj.methodA();
//		obj.methodB();
		
//		throw new ArithmeticException();
		
		obj.readAFile();

	}

	
}
