package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

//	 * HashMap Refer Map section in CollectionInterfaces.java
//
//	 * Different ways to declare HashMap 
//	 Map <String, Integer> marks = new HashMap<String, Integer> (); 
//	 HashMap <String, Integer> marks = new HashMap <String,Integer> (); 
//	 HashMap <String, Integer> marks1 = new HashMap <String, Integer>(marks);
//	 HashMap <String, Integer> marks2 = new HashMap <String, Integer>(10);
//
//	 * keyset() - will return set of keys. Return type - Set 
//	 * values() - Will return Collection of values. Return type - Collection 
//	 * entrySet() - Will return Set of Entry(K, V)
//	 * For iterating we cannot use for loop, but we can use other types
//
//	 * forEach(), replaceAll() and clone() methods are overridden in HashMap 
//	 In Maps, we cannot use forEach() method on either keys or values. 
//	 We can only use for keys and values pair.
	
//	HashMap<String, Integer> map = new HashMap<String, Integer>();
//
//	map.put("A", 1);
//	map.put("B", 2);
//	map.put("A", 3);
//	map.put("C", 3)
//	map.put(null, null)
//	map.put(null, 2)
//	map.put("D", 3)
//
//	Key - String
//	Value - Integer 
//
//	Key - its like Set
//
//	duplicates not allowed
//	null - only one time
//	keySet()
//
//	value - its like List
//	Duplicates allowed
//	null - multiple times
//	value()
//
//
//	entrySet(); provides both(set) key and its respective values
//
//	1) set of keys
//	2) collection of values
//	3) set of key value pair


	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("English", 75);
		marks.put("Maths", 100);
		marks.put(null, 50);
		marks.put(null, 45);
		marks.put("Bio", null);
		marks.put("Physics", null);
		marks.put("Chemistry", 75);
		marks.put("Maths", 95);

		System.out.println(marks);

		Map<String, Integer> marks10 = new HashMap<String, Integer>();
		marks10.putAll(marks);
		System.out.println(marks10);
		
		System.out.println("******* Iterating key and values using foreach loop*****");
		Set<String> keys = marks.keySet();
		for(String each: keys) {
			System.out.println(each);
		}
		
		Collection<Integer> values = marks.values();
		for(Integer each: values) {
			System.out.println(each);
		}
		
		System.out.println("iterator");
		Set<Entry<String, Integer>>  entrySet = marks.entrySet();
//		entrySet.get();
		Iterator<Entry<String, Integer>>  iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("*****Iterator usign Map.Entry");
		Set<Map.Entry<String, Integer>>  entrySet1 = marks.entrySet();
		Iterator<Map.Entry<String, Integer>>  iterator1 = entrySet.iterator();

		
		while(iterator1.hasNext()) {
			Entry<String, Integer> entry = iterator1.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//			if(null.getKey())
			
			if(entry.getKey() == null) {
//				System.out.println(entry.getValue());
				continue;
			}
		
//			String key = entry.getKey();
//			if(key != null && key.equals("English")) {
			if(entry.getKey() != null && entry.getKey().equals("English")) {
				System.out.println(entry.getValue());
			}
		}
		
		
//		for (Map.Entry<String, Integer> entry1 : marks10.entrySet()) {
//			System.out.println(entry1.getKey());
//			System.out.println(entry1.getValue());
//		}	
		
//		HashMapClass obj = new HashMapClass();
//		obj.mapPractice();

	}

	public void mapPractice() {

		HashMap<String, Integer> marks = new HashMap<String, Integer>();
//		HashMap <String, Integer> marks1 = new HashMap <String, Integer> (marks);
//		HashMap <String, Integer> marks2 = new HashMap <String, Integer> (10);

		marks.put("English", 75);
		marks.put("Maths", 100);
		marks.put(null, 50);
		marks.put(null, 45);
		marks.put("Bio", null);
		marks.put("Physics", null);

		marks.put("Chemistry", 75);
		marks.put("Maths", 95);
		marks.put("English", 75); // does not allow duplicate key

		System.out.println(marks);
//		null.

		System.out.println("Practice keySet() method************");
		Set<String> keys = marks.keySet();
		for (String eachKey : keys) {
			System.out.println(eachKey);
//			if (eachKey.equals("Bio")) {
			if (eachKey != null && eachKey.equals("Bio")) {
				System.out.println("Key has Bio");
			}
		}

		Collection<Integer> value = marks.values();
		for (Integer eachvalue : value) {
			System.out.println(eachvalue);
		}
		
		
//		Set<Map.Entry <String, Integer>>  keyValues = marks.entrySet();
//		keyValues.
		
//		Set <Integer> value1 = (Set<Integer>) marks.values();
//		for(Integer eachvalue :value1) {
//			System.out.println(eachvalue);
//		}

//		Removing duplicate values from Map - by getting all the values from Map and put that into Set.
//		So duplicates will be removed as Set do not allow duplicates
		HashSet<Integer> setvalue = new HashSet<Integer>();
		Collection<Integer> collvalue = marks.values();
		System.out.println(collvalue);
		for (Integer value2 : collvalue) {
			setvalue.add(value2);
		}
		System.out.println(setvalue);

//		putAll() - is nothing but add all. 
//		It is simply adds B value to A
//		Initially if A has 5 values and B has 2 values, after A.putAll(B), A will be having 7 values.
		HashMap<String, Integer> marks1 = new HashMap<String, Integer>();
		System.out.println("*********** putAll ************");
		marks1.putAll(marks);
		System.out.println(marks1);

		System.out.println(marks.containsKey("English"));
		System.out.println(marks.containsValue(75));
		System.out.println(marks.get("English"));

//		remove - returns true/false if the specified key and value is present
		System.out.println(marks.remove("Bio", 75));
		System.out.println(marks.remove("Bio", null));
		System.out.println(marks);

//		Iterating Map using iterator()
//		Set<String> allMarks = marks.keySet();
//		Iterator<String> iterateMarks = allMarks.iterator();
//		Iterator<String> iterateMarks = marks.keySet().iterator();
		Iterator<String> marksIterator = marks.keySet().iterator();
		System.out.println("********* Iterating keys alone ********");
		while (marksIterator.hasNext()) {
			System.out.println(marksIterator.next());
//			System.out.println(marks.values());
		}

		System.out.println("********* Iterating Map values alone ********");
		Iterator<Integer> valueIterator = marks.values().iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}

		System.out.println("********entrySet() method ******");
		Set<Entry<String, Integer>>  entrySet = marks.entrySet();
		Iterator<Entry<String, Integer>>  iterateEntrySet = entrySet.iterator();
		while (iterateEntrySet.hasNext()) {
			System.out.println(iterateEntrySet.next());
		}
//		Above is written as below
		Iterator<Map.Entry<String, Integer>> entrySetIterator = marks.entrySet().iterator();
		while (entrySetIterator.hasNext()) {
			System.out.println(entrySetIterator.next());
		}

		System.out.println("********entrySet() method using getKey() and getValue()******");
		Iterator<Map.Entry<String, Integer>> entrySetIterator1 = marks.entrySet().iterator();
		while (entrySetIterator1.hasNext()) {
//			System.out.println(entrySetIterator1.next().getKey());
//			System.out.println(entrySetIterator1.next().getValue());
//			System.out.println(entrySetIterator1.next().getKey() + " : " + entrySetIterator1.next().getValue());
			Map.Entry<String, Integer> entry = entrySetIterator1.next();
			System.out.println("Key : " + entry.getKey() + ", " + " Value : " + entry.getValue());
		}

		System.out.println("********entrySet() method validation******");
		Set<Entry<String, Integer>> entrySet1 = marks.entrySet();
		Iterator<Entry<String, Integer>> entrySetIterator2 = entrySet1.iterator();
		int temp = 0;
		while (entrySetIterator2.hasNext()) {
			Map.Entry<String, Integer> entry = entrySetIterator2.next();
			if (entry.getKey() == null) {
				if (entry.getValue().equals(45))
					System.out.println("TRUE");
			}

			if (entry.getKey() != null && entry.getKey().equals("English")) {
				if (entry.getValue().equals(75))
					System.out.println("******************TRUE**********************");
			}
			if (entry.getValue() != null && entry.getValue().equals(75)) {
				temp++;
			}
		}
//			entry.getValue().equals(entry)
		if (temp > 1) {
			System.out.println("Map contains value 75, more than once");
		} else if (temp == 1) {
			System.out.println("Map contains value 75");
		} else
			System.out.println("Map does not contain value 75");
		
		

		System.out.println("********* Iterating keys alone using foreach loop ********");
		for (String eachKey : marks.keySet()) {
			System.out.println(eachKey);
		}

		System.out.println("********* Iterating values alone using foreach loop ********");
		for (Integer eachValue : marks.values()) {
			System.out.println(eachValue);
		}

		System.out.println("******* Iterating key and values using foreach loop*****");
		Map<String, Integer> marks10 = new HashMap<String, Integer>();
		marks10.putAll(marks);
		for (Map.Entry<String, Integer> entry1 : marks10.entrySet()) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}
		
		System.out.println("********* foreach() method ***");
		marks.forEach((a, b) -> System.out.println(a + ":" + b));

	}
}

