package constructor;

public class ConstructorPractice_Final {
	int a = 10;
	static int b = 20;

	final int c = 20;
	final int interest = 10;

	final int interest1;
	final int interest2;

	public ConstructorPractice_Final() {
		this.interest1 = 8;
		interest2 = 0;
//		interest = 25;
		System.out.println("I am constructor");
	}

	public ConstructorPractice_Final(int interest1) {
		this.interest1 = interest1;
		this.interest2 = interest1;
//		interest2 = interest1;
		System.out.println("I am constructor");
		System.out.println(this.c);
	}

	public static void main(String[] args) {
//		ConstructorPractice_Final obj = new ConstructorPractice_Final();
		ConstructorPractice_Final obj = new ConstructorPractice_Final(20);
		System.out.println(obj.a);
		System.out.println(obj.interest);
		System.out.println(obj.interest1);
		obj.method1();
		
//		obj.c = 220;
		
		obj.homeLoan();
		obj.method1();
		
		obj.educationLoan();
		obj.method1();
		
	}

	public void method1() {
		System.out.println("I am method1");
		int processingFee = interest1+ 0;
		System.out.println(processingFee);
//		interest1 = 11;
	}

	public void homeLoan() {
//		ConstructorPractice_Final obj = new ConstructorPractice_Final();
		ConstructorPractice_Final obj = new ConstructorPractice_Final(10);
		System.out.println(interest1);
	}

	public void educationLoan() {
//		ConstructorPractice_Final obj = new ConstructorPractice_Final();
		ConstructorPractice_Final obj = new ConstructorPractice_Final(12);
		System.out.println(interest1);
	}

}
