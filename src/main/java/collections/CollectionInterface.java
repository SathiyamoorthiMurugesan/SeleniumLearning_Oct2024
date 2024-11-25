///*
//	
//	<E> - Class we use inside a collection
//	<T> - Collection variable name 
//	 O - Elements of the collection
//	
//1) What is collection
//	* Collection is a framework in java
//	* It contains packages, interfaces and classes which helps us to store and process data efficiently.
//	* In collection, we don't use primitive data types but Wrapper classes of the same-->what?
//
//2) DisAdvantages in array
//	* array need to be created with size.
//	* We can not increase/decrease the size of an array during run time
//	* The default value of array is null. So when we perform any actions like clone an array, we get "null pointer exception".
//	* If we go beyond array size (knowingly or unknowingly), we will get "ArrayIndexOutOfBoundException"
//	* array holds only the similar data type, it can be either int, String, Object, classes, etc...
//	* We can not add an new element or delete an existing element in an array
//	* We need to create a new array with different size, to achieve the previous step
//	* array is not implemented with any structural data structures, so there is no readymade methods are available
//	* Performance is faster compare to collections
//	* useful when size is known
//	 
//3) Advantages of collection
//	* No need to mention the size when creating a collection - but the default size is 10;
//	* We can increase or decrease size during run time
//	* Can have both hetro and homogeneous data (single collection can have, Integer, String and Character but all in the form of Object)--what?
//	* Collection holds only objects 
//	* We can easily perform add or remove element from a collection
//	* Collection is implemented with standard data structure, so it has many useful methods
//	 
//4) Hierarchy in Collection
//	* refer - https://www.javatpoint.com/collections-in-java
//	* Iterable interface is the parent of Collection interface
//	* It has below methods ->what?
//	* 	Iterator<T> iterator();
//	* 	forEach(Consumer<? super T> action)
//	* 	SplitIterator<T> splitIterator()
//	
//5) Useful methods in Collection interface
//	* size();
//	* isEmpty();
//	* contains(Object o)
//	* Iterator<E> iterator(); //repeated
//	* toArray();
//	* toArray(T[] a);
//	* add(E e);
//	* remove(Object o);
//	* containsAll(Collection<?> c)
//	* addAll(Collection<? extends E> c);
//	* removeAll(Collection<?> c);
//	* removeIf(Predicate<? super E> filter)
//	* retainAll(Collection<?> c);
//	* clear();
//	* equals(Object o);
//	* Spliterator<E> spliterator(); //override
//	* Stream<E> parallelStream();
//	* 
//	* 
//5) List Interface
//	* It extends Collection interface
//	* Its an ordered collection, which means we can find any element using the index
//	* LIST ALLOWS DUPLICATES 
//	* Classes which extends List Interface are, ArrayList, LinkedList, Vector
//	* Allows MULTIPLE null elements
//	* Useful methods 
//	* 	includes all the methods in Collection interface
//	* 	sort(Comparator<? super E> c)
//	* 	get(int index);
//	* 	set(int index, E element);
//	* 	add(int index, E element);
//	* 	remove(int index);
//	* 	indexOf(Object o);
//	* 	lastIndexOf(Object o);
//	* 	listIterator();
//	* 	listIterator(int index);
//	* 	subList(int fromIndex, int toIndex);
//	* 	spliterator();
//	* 	of()
//	* 	of(E e1)
//	* 	of(E e1, E e2)
//	* 	of(E... elements)
//	* 	
//6) Set Interface
//	* Its an un-ordered collection
//	* DOES NOT ALLOW DUPLICATE ELEMENTS
//	* Only one Null is allowed
//	* Classes which extends SET Interface are HashSet, LinkedHashSet, TreeSet(Also implements SortedSet)
//	* Useful methods 
//	* 	includes all methods in Collection interface
//	* 	of()
//	* 	of(E e1)
//	* 	of(E e1, E e2)
//	* 	of(E... elements)
//	* 	copyOf(Collection<? extends E> coll)
//	* 
//	* Classes which implements Set interface does not have many inbuilt methods
//	* So in order to do various operations on Set, we need to convert them into List

//	* Set to List and List to Set also possible.
//	* 
//
//7) Map Interface
//	* Map does not extends Collection interface
//	* Its key value pair 
//	* DOES NOT ALLOWS DUPLICATE KEYS
//	* One key can hold only one value
//	* Map allows one null key and multiple null values
//	* The Map interface provides three views, which allow a map's contents to be viewed as 
//	* 	a set of keys, //keySet()
//	* 	collection of values, //values()
//	* 	or set of key-value mappings. //entrySet()
//	* Useful methods in Map interface
//	* 	size();
//	* 	isEmpty();
//	* 	containsKey(Object key);
//	* 	containsValue(Object value);
//	* 	get(Object key);
//	* 	put(K key, V value);
//	* 	remove(Object key);
//	* 	putAll(Map<? extends K, ? extends V> m);
//	* 	clear();
//	* 	keySet();
//	* 	values();
//	* 	entrySet(); return type:   Set<Map.Entry<K, V>>
//	* 	A map entry (key-value pair).  The entrySet method returns a collection-view of the map, whose elements are of this class.  The
//	* 		interface Map.Entry<K, V> {
//	* 			getKey();
//	* 			getValue();
//	* 			setValue(V value);
//	* 			equals(Object o);
//	* 			comparingByKey();
//	* 			comparingByValue();
//	* 			getOrDefault(Object key, V defaultValue);
//	* 			forEach(BiConsumer<? super K, ? super V> action);
//	* 			replaceAll(BiFunction<? super K, ? super V, ? extends V> function);
//	* 			putIfAbsent(K key, V value);
//	* 			remove(Object key, Object value);
//	*			replace(K key, V oldValue, V newValue);
//	*			replace(K key, V value); 
//	*			of();
//	*			of(K k1, V v1);
//	*			of(K k1, V v1, K k2, V v2);
//	*			ofEntries(Entry<? extends K, ? extends V>... entries);
//	*			entry(K k, V v);
//	*			copyOf(Map<? extends K, ? extends V> map)
//	*        How forEach method is created/derived
//	*        *	for ( String eachname : name) {
//	*				syso(eachname);
//	*			}
//	*
//	*		 *	String name.for(eachname) {
//	*				syso(eachname);
//	*			}
//	*
//	*		* name.forEach(eachname -> syso(eachname);)	 // -> lambda expression		
//	* 
//	* */

package collections;

import java.util.Collection;
import java.util.Iterator;

public class CollectionInterface  {
	
//	ArrayList
	
//	Iterable
	
//	Collection
	
//	Collections
	
//	HashMap

}
