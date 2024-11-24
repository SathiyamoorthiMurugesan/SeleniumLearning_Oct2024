package threadConcept;

public class ThreadPractice extends Thread {
	
	public void run() {
		for(int i = 1; i<1000; i++) {
			System.out.println("Parent method Thread (child)"+currentThread());
		}
		System.out.println(currentThread()+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}

	public static void main(String[] args) {
		
		ThreadPracticeMethod();
	}
	
	public static void ThreadPracticeMethod() {

		ThreadPractice p = new ThreadPractice();
		p.start();
		
		try {
			p.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Child1 c1 = new Child1();
		c1.start();
		
		Child2 c2 = new Child2();
		c2.start();
		
		for(int i = 1; i<1000; i++) {
			System.out.println("This is main Thread"+currentThread());
		}
		
		System.out.println(currentThread()+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	
	}

}

class Child1 extends ThreadPractice {
	public void run() {
		for(int i = 1; i<1000; i++) {
			System.out.println("child1****"+currentThread());
		}
	}
}

class Child2 extends Child1 {
	public void run() {
		for(int i = 1; i<1000; i++) {
			System.out.println("child2****"+currentThread());
		}
	}
}