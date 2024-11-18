
package throwException;

import javax.security.auth.RefreshFailedException;

public class ATMScenario4 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void ATM() {
		try {
			System.out.println("			*****Welcome to HDFC ATM*****	");
			throw new RefreshFailedException("ATM out of service try our nearest ATM for service");
		}
//			throw new RefreshFailedException();
		catch (RefreshFailedException r) {
			System.out.println(r.getMessage() + "*********");
			System.out.println("Sorry for the inconvinence");
		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("I am main class exception");
		}

	}

	public static void InvalidTransaction() {
		ATM();
		System.out.println("*************");
		try {
			System.out.println("Trying in next Active ATM Machine and entering the pin");
			throw new RefreshFailedException("Pin cannot have all values as zero's");
		} catch (RefreshFailedException m) {
			System.out.println(m.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());
//			System.out.println(e.getLocalizedMessage());
			System.out.println("I am main class exception");
		} finally {
			System.out.println("Please be advised your account will be locked after 3 invalid attempts");
		}
	}

	public static void main(String[] args) {

		InvalidTransaction();
		System.out.println("************");
		System.out.println("Entered valid pin and transaction in process");
		System.out.println("Transaction success. Please collect your cash");

	}
}
