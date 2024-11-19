package throwException;

import java.io.IOException;

public class ThrowExceptionPractice {

	public void method1() throws IOException {
//	public void method1() throws Exception {

		throw new IOException();

	}

	public int method2(int a, int b) throws ArithmeticException {
//	public int method2(int a, int b) throws RunTimeException {
//	public int method2(int a, int b) throws Exception {

		int c;
		if (b == 0) {
			throw new ArithmeticException();
		} else
			c = a / b;
		return c;
	}
	
//	public static void main(String[] args) throws IOException, ArithmeticException, NullPointerException {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello I am main method");
		
		ThrowExceptionPractice obj = new ThrowExceptionPractice();
		obj.method1();
		
		obj.method2(10, 2);
	}

}
