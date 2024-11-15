package exceptionLearning;

import java.io.IOException;

public class ExceptionPractice {

	public static void main(String[] args) {

//		int a, b;
		int a = 10;
		int b = 0;
		int c;

		String str = null;

		try {
			c = a / b;
//			str.toLowerCase();
//			throw new NullPointerException();
			System.out.println("To check the try block");
		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(IOException e) {
//		System.out.println(e.getMessage());
//		}
		catch (NullPointerException e) {
			System.out.println("We have captured the null pointer exception");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
//		finally {
//			System.out.println("aaa");
//		}

		System.out.println("hello");
	}

}

class ATMPractice {

	public void getMoneyFromATM() {

		System.out.println("Please enter an amount");

//		try {
//			int amount = 40;
//			if(amountGreaterThan99 and lessThan500)
//		} catch (AmountLessThan100Exception e) {
//
//		} catch (excep2 e) {
//
//		}
//		finally {
//			System.out.println("please enter multiples of 100");
//		}

	}

}
