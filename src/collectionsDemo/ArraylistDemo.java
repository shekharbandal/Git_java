package collectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class ArraylistDemo {
	public static void main(String[] args) {
		
	ArrayList a1= new ArrayList<>();
	a1.add(20);
	a1.add(25);
	a1.add(25);
	a1.add(26);
	a1.add(28);
	a1.add(30);
	a1.add(28);
	a1.add("shekhar");
	
	
	System.out.println("The values in arraylist a1 are "+ a1);
	
	int frequency = Collections.frequency(a1, 25);
	System.out.println("The frequency of element  25 is  " +frequency);
 
	
	}
	}