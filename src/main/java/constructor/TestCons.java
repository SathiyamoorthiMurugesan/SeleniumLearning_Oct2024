package constructor;

public class TestCons {
	
	public String rollNo, name, age;
	String standard  = "LKG"; 
	
	public TestCons() {
		
	}
	
	public TestCons(String rollNo, String name, String age) {
		System.out.println(rollNo + "   " + name + "   " + age + "   " + standard);
	}
	
	public TestCons(String rollNo, String name, String age, String standard) {
		System.out.println(rollNo + "   " + name + "   " + age + "   " + standard);
	}
	
	

	public static void main(String[] args) {
		
		TestCons student1 = new TestCons();
		student1.rollNo = "1";
		student1.name = "A";
		student1.age = "10";
//		student1.standard = "LKG";
		System.out
				.println(student1.rollNo + "   " + student1.name + "   " + student1.age + "     " + student1.standard );
		
		TestCons student2 = new TestCons();
		student2.rollNo = "2";
		student2.name = "B";
		student2.age = "10";
//		student2.standard = "LKG";
		System.out
				.println(student2.rollNo + "   " + student2.name + "   " + student2.age + "     " + student2.standard);
		
		TestCons student3 = new TestCons("3", "C", "11");
		
		TestCons student4 = new TestCons("4", "D", "11", "2nd std");
		
	}

}
