package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayListClass {

//	WebDriver
//	/* ArrayList
//	 * 	It implements List Interface
//	 * 	Its a resizeable array
//	 * 	Each ArrayList has a capacity and it will increase automatically if we add values more than the given capacity
//	 * 	Initial size of ArrayList is 10 if no size is mentioned while declaring ArrayList

//	 * 	ArrayList can be declared as below
//	  		ArrayList li = new ArrayList(); //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
//			List list = new ArrayList();  //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
//			List<Integer> list1 = new ArrayList<Integer>(); //Generic ArrayList, we can only add Integer
//			ArrayList<Integer> AI = new ArrayList<Integer>();
//			ArrayList<String> AS = new ArrayList<String>(10); //Generic ArrayList, we can only add String
//			ArrayList<String> AS1 = new ArrayList<String>(AS);
	
//	 * 	Useful methods in ArrayList
//	 * 		All the methods declared in Collection and List interfaces are implemented in this class and along with that we have below methods
//	 * 		trimToSize();
//	 * 		ensureCapacity(int minCapacity);
//	 * 		grow(int minCapacity);
//	 * 		grow();
//	 * 		newCapacity(int minCapacity);
//	 * 		hugeCapacity(int minCapacity);
//	 * 		g();
//	 * 			Since CLone() method returns Objects, we need to cast Object to ArrayList
//	 * 		add(E e, Object[] elementData, int s);
//	 * 		equalsRange(List<?> other, int from, int to) ;
//	 * 		equalsArrayList(ArrayList<?> other);
//	 * 		fastRemove(Object[] es, int i);
//	 * 		removeRange(int fromIndex, int toIndex);
//	 * 		iterator();
//	 * 			hasNext();
//	 * 			next();
//	 * 			remove();
//	 * 			forEachRemaining(Consumer<? super E> action);
//	 * 			checkForComodification();
//	 * 		ListIterator<E>();
//	 * 			- This method returns ListIterator Class
//	 * 			- it has below methods
//	 * 			hasPrevious();
//	 * 			nextIndex();
//	 * 			previousIndex();
//	 * 			previous();
//	 * 			set(E e);
//	 * 			add(E e);
//	 * 		subList(int fromIndex, int toIndex) 
//	 * 			- this method returns SubList class
//	 * 			- This sublist class has all the list methods
//	 * 			- and its own constructors
//	 *		SplitIterator() 
//	 *			- This method returns ArrayListSpliterator class
//	 *			- This class has some methos such as getFense(), trySplit(),    ..
//	 *
//	 */

//	ArrayList
//	LinkedList
//	HashSet
//	LinkedHashSet
//	TreeSet
//	HashMapPractice
//	LinkedHashMap
//	TreeMap

	public static void ArrayListPractice() {

		ArrayList<String> cars = new ArrayList<String>();

		System.out.println("Initial size of ArrayList" + cars.size());

		cars.add("Maruti");
		cars.add("swift");
		cars.add("Audi");

		System.out.println(cars);

		cars.add(2, "Volvo");
		cars.add("Maruti");
		cars.add("Swift");
		cars.add(null);
		cars.add(null);
//		cars.add(2, "BMW"); 

		System.out.println(cars);
		System.out.println(cars.get(0));
//		System.out.println(cars.get(9));
		System.out.println(cars.size());

		System.out.println("toString method");
		System.out.println(cars.toString());

		System.out.println("****for loop****");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		System.out.println("****for each****");
		for (String each : cars) {
			System.out.println(each);
		}

		System.out.println("****** After set() method************");
		cars.set(3, "BENZ");
		System.out.println(cars);

		cars.remove(1);
		System.out.println(cars);

		System.out.println();

//		cars.clear();
//		System.out.println(cars);

//		Collections.sort(cars); 
//		System.out.println(cars);

		ArrayList<String> cars1 = (ArrayList<String>) cars.clone();
		System.out.println(cars1);

//		ArrayList<String> cars24 = ArrayList<String>(cars);

		System.out.println("******forEach method******");
//		for(String each: cars)
		cars1.forEach(eachCars1 -> System.out.println(eachCars1)); // lambda expression

		System.out.println("******forEachRemaining method******");
		Iterator<String> carsIterator = cars1.iterator();
//		System.out.println(carsIterator);
		System.out.println(carsIterator.hasNext());
		System.out.println("using next() method " + carsIterator.next());
		System.out.println("*****ForEachRemaining***********");
		carsIterator.forEachRemaining(eachCars -> System.out.println(eachCars));

		System.out.println("Testing Iterator ForEachRemaining method");
		Iterator<String> carsIterator1 = cars1.iterator();
		System.out.println(carsIterator1.hasNext());
		carsIterator1.forEachRemaining(eachCars -> System.out.println(eachCars));

		System.out.println("***********");
		cars1.forEach(eachCars1 -> System.out.println(eachCars1));

		System.out.println("******Using Iterator********");
		Iterator<String> iterator = cars.iterator();
		while (iterator.hasNext()) {
			String carname = iterator.next(); // this is like get(i)
			System.out.println(carname);
		}

		System.out.println("******Using ListIterator********");
//		List<String> coolStringList = Arrays.asList("Java", "Scala", "Groovy");
		List<String> coolStringList = new ArrayList<String>();
		coolStringList.add("Java");
		coolStringList.add("Scala");
		coolStringList.add("Groovy");

		ListIterator<String> listIterator = coolStringList.listIterator();

//		System.out.println("++++" +listIterator.hasPrevious());

		System.out.println("++++" + listIterator.hasNext());
		System.out.println("&&&&&&&&&" + listIterator.next());
//		System.out.println("++++" +listIterator.hasPrevious());

//		ListIterator <String> listIterator1 = coolStringList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("++++" + listIterator.hasPrevious());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
//			String name3 = listIterator.previous();
//			System.out.println(name3);
		}

		Spliterator<String> splitIterator = coolStringList.spliterator();
		System.out.println("sathyaaaaaaaa");
		System.out.println(splitIterator.estimateSize());
		System.out.println(splitIterator.ORDERED);

		ArrayList list = new ArrayList();
		list.add(1);
		list.add("Shiva");
		list.add(0.1f);
		System.out.println(list);

//		Object[] obj = coolStringList.toArray();
		Object[] obj = list.toArray();
		System.out.println(obj);

		for (Object each : obj) {
			System.out.println(each);
		}

		System.out.println("Converting array into arrayList");
		List<Object> list23 = Arrays.asList(obj);
		System.out.println(list23);

//		String[] obj2 = (String[]) coolStringList.toArray();
//		for(String each: obj2) {
//			System.out.println(each);
//		}

	}

	public static void main(String[] args) {
		countLettersInAString();
	}

	public static void countLettersInAString() {
		String val = "Vinothini";

		String[] str = val.split("");

//		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < str.length; i++) {
			int count = 1;
			set.add(str[i]);
//			if(set.contains(str[i])){
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					count = count + 1;
//					set.add(str[i]);
				}
			}
//			}
//			set.add(str[i]);
			System.out.println("Letter " + str[i] + " is repeating " + count + " times");
		}
		System.out.println(set);
	}

}
