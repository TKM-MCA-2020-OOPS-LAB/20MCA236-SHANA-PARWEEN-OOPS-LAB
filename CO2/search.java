package search;
import java.util.Scanner;
public class search {

	public static void main(String[] args) {
		int i,a,count,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		count = sc.nextInt();
		int array[] = new int[count];
		
		System.out.println("Enter the elements of the array: ");
		for(i=0;i<count;i++)
		{
			 array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched: ");
		a = sc.nextInt();
		for(i=0;i<count;i++)
		{
			if(array[i] == a)
			{
				flag = 1;
				break;
			}
			else
			{
				flag = 0;
			}
		}
			if(flag ==1)
			{
				System.out.println("Element found at position:"+(i + 1));
				
			}
			else
			{
				System.out.println("Element not found");
			}
		
		
	}
}
