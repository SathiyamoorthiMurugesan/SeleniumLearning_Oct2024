package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class IteratorDemo {

	static Integer a;
	public static void  iteratorMethod() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
//		Iterator<Integer> it= list.iterator();
//		while (it.hasNext()) {
//            System.out.println(it.next());
//		}
//		
		ListIterator<Integer> LT = list.listIterator(3);
		
//		while (LT.hasNext()) {
//			System.out.println(LT.next());
//		}
		
//		a=LT.next();
//		System.out.println(a);
//		a=LT.previous();
//		System.out.println(a);
		
		while (LT.hasPrevious()) {
			System.out.println(LT.previous());
		}
		
//		Spliterator<Integer> ST  = list.spliterator();
//		ST.
	
	}
	public static void main(String[] args) {
		iteratorMethod();
	}

}
