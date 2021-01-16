package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a2 = new ArrayList<String>();
		System.out.println("The arraylist a2 size is"  +   a2.size());
		a2.add("Ally");
		a2.add("jack");
		a2.add("Kelly");
		a2.add("Andy");
		a2.add("Wendi");
		
		Iterator it  = a2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		                    }
	
	}

}
