/* ArrayList
 * 
	 * 	It implements List Interface
	 * 	Its a resizeable array
	 * ArrayList maintains the insertion order i.e order of the object in which they are inserted. 
	 * 	Each ArrayList has a capacity and it will increase automatically if we add values more than the given capacity
	 * 	Initial size of ArrayList is 10 if no size is mentioned while declaring ArrayList
	 * 	ArrayList can be declared as below
	  		ArrayList li = new ArrayList(); //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
			List list = new ArrayList();  //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
			List<Integer> list1 = new ArrayList<Integer>(); //Generic ArrayList, we can only add Integer
//			int[] arr =new int[3];
			ArrayList<Integer> AI = new ArrayList<Integer>();
			ArrayList<String> AS = new ArrayList<String>(10); //Generic ArrayList, we can only add String
			ArrayList<String> AS1 = new ArrayList<String>(AS);
			ArrayList<String> AS2 = new ArrayList<String>(Set<String> s);
			***Using Arrays class**
			List<String> progList = Arrays.asList("Java","Android","Python","C++");  
	 * 	Useful methods in ArrayList
	 * 
	 * 
	 * 		All the methods declared in Collection and List interfaces are implemented in this class and along with that ArrayList have below methods
	 * 
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Collection Interface methods $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* size();
	* isEmpty();
	* contains(Object o)
	* toArray();
	* toArray(T[] a);
	* add(E e);
	* remove(Object o);
	* containsAll(Collection<?> c)
	* addAll(Collection<? extends E> c);
	* removeAll(Collection<?> c);
	* removeIf(Predicate<? super E> filter)
	* retainAll(Collection<?> c);
	* clear();
	* equals(Object o);
	* Spliterator<E> spliterator();
	* Stream<E> parallelStream();
	* 
	* 
 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ List Interface methods $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	* It extends Collection interface
	* Its an ordered collection, which means we can find any element using the index
	* LIST ALLOWS DUPLICATES 
	* Classes which extends List Interface are, ArrayList, LinkedList, Vector
	* Allows multiple null elements
	* Useful methods 
	* 	includes all methods in Collection interface
	* 	sort(Comparator<? super E> c)
	* 	get(int index);
	* 	set(int index, E element);
	* 	add(int index, E element);
	* 	remove(int index);
	* 	indexOf(Object o);
	* 	lastIndexOf(Object o);
	* 	listIterator();
	* 	listIterator(int index);
	* 	subList(int fromIndex, int toIndex);
	* 	spliterator();
	* 	of()
	* 	of(E e1)
	* 	of(E e1, E e2)
	* 	of(E... elements)
	* 
	* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Arraylist class methods $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 * 		trimToSize();
	 * 		ensureCapacity(int minCapacity);--10
	 * 		grow(int minCapacity);--min cap+1?
	 * 		grow();
	 * 		newCapacity(int minCapacity);
	 * 		hugeCapacity(int minCapacity);
	 * 		clone();
	 * 			Since CLone() method returns Objects, we need to cast Object to ArrayList
	 * 		toArray();
	 * 		add(E e, Object[] elementData, int s);
	 * 		equalsRange(List<?> other, int from, int to) ;
	 * 		equalsArrayList(ArrayList<?> other);
	 * 		fastRemove(Object[] es, int i);
	 * 		removeRange(int fromIndex, int toIndex);
	 * 		iterator();
	 * 			hasNext();
	 * 			next();
	 * 			remove();
	 * 			forEachRemaining(Consumer<? super E> action);
	 * 			checkForComodification();
	 * 		ListIterator<E>();
	 * 			- This method returns ListIterator Class
	 * 			- it has below methods
	 * 			hasPrevious();
	 * 			nextIndex();
	 * 			previousIndex();
	 * 			previous();
	 * 			set(E e);
	 * 			add(E e);
	 * 		subList(int fromIndex, int toIndex) 
	 * 			- this method returns SubList class
	 * 			- This sublist class has all the list methods
	 * 			- and its own constructors
	 *		SplitIterator() -->doubt
	 *			- This method returns ArrayListSpliterator class
	 *			- This class has some methos such as getFense(), trySplit(), etc..
	 *
	 */

//	ArrayList
//	LinkedList
//	HashSet
//	LinkedHashSet
//	TreeSet
//	HashMapPractice
//	LinkedHashMap
//	TreeMap

package collections;

//import java.util.ArrayList;
import java.util.*;

import array.DemoArray;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);

		list2.add(20);
		list2.add(10);
		list2.add(20);
		list2.add(null);
		list2.add(null);

		System.out.println(list2);

		System.out.println(list2.get(0));
		System.out.println(list2.get(4));

		System.out.println("Iterating ArrayList using basic for loop");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

		System.out.println("Iterating ArrayList using for each loop");
		for (Integer each : list2) {
			System.out.println(each);
		}

		System.out.println("Iterating ArrayList using Iterator");
		Iterator<Integer> ite = list2.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

		Spliterator<Integer> spIte = list2.spliterator();

		System.out.println("Iterate Arraylist using List Iterator");
		ListIterator<Integer> liIte = list2.listIterator();

		System.out.println(liIte.nextIndex());
		System.out.println(liIte.previousIndex());

		while (liIte.hasNext()) {
			System.out.println(liIte.next());
		}

		System.out.println(liIte.nextIndex());
		System.out.println(liIte.previousIndex());

		ListIterator<Integer> liIte1 = list2.listIterator();
		System.out.println(liIte1.nextIndex());
		System.out.println(liIte1.previousIndex());

		System.out.println("List Iterator Has Previous method");
		ListIterator<Integer> listIteratorCheck = list2.listIterator();

		while (listIteratorCheck.hasNext()) {
			System.out.println(listIteratorCheck.next());
		}

		while (listIteratorCheck.hasPrevious()) {
			System.out.println(listIteratorCheck.previous());
		}

		System.out.println("ArrayList toArray() method");
		Object[] myListToArray = list2.toArray();
		for(Object abc : myListToArray) {
			System.out.println(abc);
		}
		
		System.out.println("ArrayList methods practice");
		
		test();
		

	}

	public static void test() {
		
		ArrayList<Integer> AI = new ArrayList<Integer>();
		
		AI.add(10);
		AI.add(20);
		AI.add(50);
		AI.add(40);
		
		System.out.println(AI);
		
		
		AI.add(1, null);
		
		System.out.println(AI);
		
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		
		A2.addAll(AI);
		System.out.println(A2);
		
		ArrayList<Integer> A3 = new ArrayList<Integer>();
		System.out.println(A3.isEmpty());
		A3.add(11);
		A3.add(22);
		A3.add(55);
		A3.add(44);
		
//		A3.addAll(2, AI);
		System.out.println(A3);
		
		System.out.println(A3.contains(55));
		
		System.out.println(A3.indexOf(22));
		
		System.out.println(A3.get(0));
		
		System.out.println(A3.set(3, 66));
		System.out.println(A3);
		
		System.out.println(A3.isEmpty());

	}
}
