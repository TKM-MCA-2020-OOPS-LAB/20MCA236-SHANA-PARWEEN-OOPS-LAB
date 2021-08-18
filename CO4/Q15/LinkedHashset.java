import java.util.*;
public class LinkedHashset {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> LinkedHashset = new LinkedHashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the set:");
		int n = sc.nextInt();
		System.out.println("\nEnter the elements in the set: ");
		
		for(int i =0;i<n;i++)
		{
			String s=sc.next();
			LinkedHashset.add(s);     
	 
		}
		 System.out.println("Size of the LinkedHashSet = " +LinkedHashset.size());  
		 System.out.println("\nOriginal LinkedHashSet:" +LinkedHashset);  
		 System.out.println("\nRemoving 3 from LinkedHashSet: " +LinkedHashset.remove("3"));
		 System.out.println("\nChecking if '10' is present=" +LinkedHashset.contains("10"));
		 System.out.println("\nUpdated LinkedHashSet: " +LinkedHashset);
		 
		 System.out.println("\nAfter Iterating: ");
	        for (String s : LinkedHashset)
	            System.out.print(s + ", ");
	        System.out.println();
	}
}
