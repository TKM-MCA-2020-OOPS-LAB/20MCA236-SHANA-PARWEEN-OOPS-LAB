import java.util.*;

public class Treemap {
	public static void main(String args[])
	{
	//Create HashMap
			Map<String,String> hashMap = new HashMap<>();
			
			hashMap.put("3", "Green");
			hashMap.put("1", "Brown");
			hashMap.put("2", "Yellow");
			System.out.println("HashMap: " + hashMap);
			
			// construct a new TreeMap from HashMap
			Map<String, String> treeMap = new TreeMap<>();
			treeMap.putAll(hashMap);

	      System.out.println("\nTreeMap: " + treeMap);


   }

}
