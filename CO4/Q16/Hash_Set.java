import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Hash_Set {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in first set: ");
		int n=sc.nextInt();
		System.out.println("\nEnter the elements of first set: ");
		for(int i =0;i<n;i++)
		{
			String st=sc.next();
			set1.add(st);
	 
		}
		
		System.out.println("\nEnter the number of elements in second set: ");
		int n1=sc.nextInt();
		System.out.println("\nEnter the elements of second set: ");
		for(int i =0;i<n1;i++)
		{
			String st=sc.next();
			set2.add(st);
	 
		}
		System.out.println("\nHash Set 1: " + set1);
		System.out.println("\nHash Set 2: " + set2);
		Set<String> union = new HashSet<String>(set1);
	        union.addAll(set2);
	        System.out.print("\nUnion of two Sets:");
	        System.out.println(union);
	        Set<String> intersection = new HashSet<String>(set1);
	        intersection.retainAll(set2);
	        System.out.print("\nIntersection of two Sets:");
	        System.out.println(intersection);
	        Set<String> difference = new HashSet<String>(set1);
	        difference.removeAll(set2);
	        System.out.print("\nDifference of set1 from set2:");
	        System.out.println(difference);	

	}
}
