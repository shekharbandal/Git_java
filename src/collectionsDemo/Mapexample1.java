package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapexample1 {

	public static void main(String[] args) {
		 
		 	Map map  = new HashMap();
		 	map.put(1, "Shekhar");
		 	map.put(3, "Amit");
		 	map.put(4, "Shekhar");
		 	map.put(5,"Rahul");
		 	map.put(2,"Jai");
		 	
		 	Set set = map.entrySet();
		 	Iterator itr = set.iterator();
		 	 
		 	System.out.println("Values in map are " + map);

	
}
	}

}
