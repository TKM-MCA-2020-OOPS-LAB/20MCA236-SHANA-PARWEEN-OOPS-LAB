import java.util.*;

public class stack_remove {
	public static void main(String[] args)
    {
       Stack<Integer> st=new Stack<Integer>();
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the No:of elements: ");
       int num=sc.nextInt();
       System.out.print("Add elements: ");
       for(int i=0;i<num;i++)
       {
           
           int s=sc.nextInt();
           st.add(s);
       }
       System.out.println("Stack after adding elements:"+st);
       System.out.println("Enter the index to be removed:");
		int index = sc.nextInt();
		
		int rm = st.remove(index);
		
		System.out.println("Removed Element is:"+rm);
		
		System.out.println("\nStack after removal:\n"+st);
   }
}
