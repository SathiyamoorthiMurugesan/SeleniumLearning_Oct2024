package constructor;

public class ConstructorUse3_SchoolDemo {

	public String rollNo, name, age;
	public String standard = "LKG";

	public ConstructorUse3_SchoolDemo() {

	}

	public ConstructorUse3_SchoolDemo(String rollNo, String name, String age, String standard) {

		System.out.println(rollNo + "   " + name + "   " + age + "   " + standard);
	}

	public ConstructorUse3_SchoolDemo(String rollNo, String name, String age) {

		System.out.println(rollNo + "   " + name + "   " + age + "   " + standard);
	}

	public static void main(String[] args) {

		ConstructorUse3_SchoolDemo student1 = new ConstructorUse3_SchoolDemo();
		student1.rollNo = "1";
		student1.name = "A";
		student1.age = "10";
//		student1.standard = "LKG";
		System.out
				.println(student1.rollNo + "   " + student1.name + "   " + student1.age + "     " + student1.standard);

		ConstructorUse3_SchoolDemo student2 = new ConstructorUse3_SchoolDemo();
		student2.rollNo = "2";
		student2.name = "B";
		student2.age = "10";
//		student2.standard = "LKG";
		System.out
				.println(student2.rollNo + "   " + student2.name + "   " + student2.age + "     " + student2.standard);

		ConstructorUse3_SchoolDemo student3 = new ConstructorUse3_SchoolDemo("3", "C", "11", "IV std");
		ConstructorUse3_SchoolDemo student4 = new ConstructorUse3_SchoolDemo("4", "D", "10");

	}

}
