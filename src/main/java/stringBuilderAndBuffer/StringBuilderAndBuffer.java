package stringBuilderAndBuffer;

public class StringBuilderAndBuffer {
	
//	Whatever we can do in StringBuilder, we can do it in StringBuffer and vice versa
//	Only difference between them is Builder is NOT thread safe.
//	Both are mutable

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Sathya");
		StringBuilder builder1 = new StringBuilder("SAthya");
		
		System.out.println(builder.compareTo(builder1));
		System.out.println(builder1.compareTo(builder));
		
		String str = "Kanmani";
		
		StringBuilder builder2 = new StringBuilder(str);
		System.out.println(builder2.reverse());
		
		
//		same you can do in StringBuffer
		
		StringBuffer buffer = new StringBuffer("Sathya");
		StringBuffer buffer1 = new StringBuffer("sathya");
		
		StringBuffer buffer2 = new StringBuffer(builder);
		
		System.out.println(buffer.reverse());
		
		
	}

}
