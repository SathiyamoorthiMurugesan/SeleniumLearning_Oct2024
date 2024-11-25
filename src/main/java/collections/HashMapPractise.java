package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractise {

	public static void main(String[] args) {

		HashMap <String, String> bankdetails = new HashMap <String, String> ();
		bankdetails.put("Customer1","SBI");
		bankdetails.put(null, "SBI");
		bankdetails.put("Customer1","ICICI");
		bankdetails.put("Customer1","HDFC");
		bankdetails.put("Customer2",null);
		bankdetails.put("Customer3","HDFC");
		bankdetails.put("Customer3","KVB");
		bankdetails.put(null, "PNB");
		bankdetails.put("Customer4",null);
		bankdetails.put("Customer5","SBI");
		System.out.println(bankdetails);
		
		
		//Using keySet() to return Key values
	
	Set <String> key = bankdetails.keySet();
	for(String customerid :key) {
	System.out.println(customerid);
	}

	//Using Values() to return value
	Collection<String> value = bankdetails.values();
	for(String bankname :value) {
	System.out.println(bankname);
	}
	
	HashSet<String> hs= new HashSet<String>();
	Collection<String> cs=bankdetails.values();
	System.out.println(cs);
	for(String dupvalues:cs) {
		hs.add(dupvalues);
	}
	System.out.println("***After removing duplicates using HashSet***");
	System.out.println(hs);

	
	
	HashMap <String, String> bankdetails2 = new HashMap <String, String> ();
	System.out.println("***Put all is to add values to another map***");
	bankdetails2.putAll(bankdetails);
	System.out.println(bankdetails2);
	
	System.out.println("**Returns true if vaue present else false**");
	
	System.out.println(bankdetails2.containsKey("null"));
	System.out.println(bankdetails2.containsKey("Customerid5"));
	System.out.println(bankdetails2.containsValue("HDFC"));
	System.out.println(bankdetails2.containsValue("Kotak"));
	System.out.println("**Returns null if there is no such key**");
	System.out.println(bankdetails2.get("Customerid1"));
	System.out.println("**Returns value of sepcific key**");
	System.out.println(bankdetails2.get("Customer1"));
	
	
	System.out.println("Returns boolean if key and vaue are present");
	System.out.println("***Before removing***");
	System.out.println(bankdetails2);
	System.out.println(bankdetails2.remove("Customer5","SBI"));
	System.out.println("***Returns false as it is case sensitive***");
	System.out.println(bankdetails2.remove("customer5","Sbi"));
	System.out.println("***After removing***");
	System.out.println(bankdetails2);

	
	System.out.println("********* Iterating keys alone ********");
	Iterator <String>  bankDetailsIterator = bankdetails.keySet().iterator();
	while(bankDetailsIterator.hasNext()) {
		System.out.println(bankDetailsIterator.next());
	}
	
	System.out.println("********* Iterating Map values alone ********");
	Iterator <String>  bankDetailsValueIterator = bankdetails.values().iterator();
	while(bankDetailsValueIterator.hasNext()) {
		System.out.println(bankDetailsValueIterator.next());
	}
	
	System.out.println("********entrySet() method ******");
	Iterator<Map.Entry<String, String>> entrySetIterator = bankdetails.entrySet().iterator();
	while(entrySetIterator.hasNext()) {
		System.out.println(entrySetIterator.next());
	}



	}}
