package inheritanceInJava;

//public class MultiLevelInheritance extends MultipleInheritance {
public class MultiLevelInheritance {
	
	public void methodMI() {
		System.out.println("I am non-static method from MultiLevelInheritance");
	}
	

	public static void main(String[] args) {
		ClassE obj1 = new ClassE();
		obj1.methodC();
		obj1.methodD();
		obj1.methodE();
		
		MultiLevelInheritance obj2 = new MultiLevelInheritance();
		obj2.methodMI();
		
		
	}

}

class ClassC extends MultiLevelInheritance {
	public void methodC() {
		System.out.println("I am non-static method from ClassC");
	}
}

class ClassD extends ClassC {
	public void methodD() {
		System.out.println("I am non-static method from ClassD");
	}
}

class ClassE extends ClassD {
	public void methodE() {
		System.out.println("I am non-static method from ClassE");
	}
}
