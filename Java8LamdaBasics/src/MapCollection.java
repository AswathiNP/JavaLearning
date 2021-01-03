import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection {
  // A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.
  // Map is not a true collection (Separate branch in collection framework)
  // A Map doesn't allow duplicate keys, but you can have duplicate values.
  
  /* 3 classes that implement Map interface
   * 1) HashMap       : Doesn't maintain order   (allow null keys and values)         
   * 2) LinkedHashMap : Maintain insertion Order (allow null keys and values)         
   * 3) TreeMap       : Sorted map (ascending)   (doesn't allow null keys and values) 
   *
				     Map                   |   Get    | ContainsKey |   Next   | Data Structure
					 ----------------------|----------|-------------|----------|-------------------------
				     HashMap               | O(1)     |   O(1)      | O(h / n) | Hash Table
				     LinkedHashMap         | O(1)     |   O(1)      | O(1)     | Hash Table + Linked List
				     TreeMap               | O(log n) |   O(log n)  | O(log n) | Red-black tree
  */
	
	public static void main(String[] args) {
		
	//1.Creating MAP
		
		// a. HashMap
			Map<Integer,String> employeeHashMap = new HashMap<>();
		
		//b.LinkedHashMap
			Map<Integer,String> employeeLinkedMap = new LinkedHashMap<>();
		
		//b.TreeMap
			Map<Integer,String> employeeTreeMap = new TreeMap<>();
		
	//2. Add (key,value) pair
		
		// PUT
			employeeHashMap.put(100, "Chris");
			employeeHashMap.put(101, "Shubha");
			employeeHashMap.put(102, "Aswathi");
		
	    // PUTIFABSENT - if absent add value and returns null. if not absent return value part
			String b= employeeHashMap.putIfAbsent(103, "Alex");
		
		// PUTALL
			employeeLinkedMap.putAll(employeeHashMap);
		
			/*Collection<String> set=employeeLinkedMap.values();
			set.forEach(System.out::println);*/
	
	//3. Get value associated with specific key
		
			String name= employeeHashMap.get(102);		
		
	//4. Check if map cointains a key/value - Case sensitive
	
			boolean b1= employeeHashMap.containsKey(100);
		
			boolean b2= employeeHashMap.containsValue("Shubha");
		
	//5. Remove a key,value pair if present. Return value field or null if not present
		
			String name3=employeeHashMap.remove(103);  //return "Alex"
		
			boolean removed= employeeHashMap.remove(104, "john"); //return false
		
    //6. Replace value for a key
		
		//a
			employeeHashMap.replace(102, "janvi"); //replace aswathi with janvi
			employeeHashMap.replace(101, "Shubha", "vishnu"); // give old value and new value
			
		//b.
			employeeHashMap.replaceAll((k,x)->x.toUpperCase()); // apply the lamda function to each value 
		
   //7. size of map
		
			int size= employeeHashMap.size();
		
   //8. check if Map is empty
		
			boolean emplyOrNot= employeeHashMap.isEmpty();
	
   //9. Iterating 
		
		// a) keySet
		
			Set<Integer> s=employeeHashMap.keySet();
			Iterator<Integer> itr=s.iterator();
			
			//itr.forEachRemaining(System.out::println);   
			
			while(itr.hasNext())
			{
				itr.next();
				//System.out.println(itr.next());
			}
		
		// b) values
		
			Collection<String> val=employeeHashMap.values();
			//val.forEach(System.out::println);
			
	   // c)EntrySet	
			
			Set<Map.Entry<Integer, String>> setEntry = employeeHashMap.entrySet();
			setEntry.forEach(entryval->System.out.println(entryval.getKey()+":"+entryval.getValue()));
	
	//10. Emptying Map	
			employeeLinkedMap.clear();
			
	/*
	 * To make thread safe map, use Collections.synchronizedMap
	 * Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
	 *      For sorted maps
	 * Map<Integer, String> map = Collections.synchronizedSortedMap(new TreeMap<>());
	*/
	}

}
