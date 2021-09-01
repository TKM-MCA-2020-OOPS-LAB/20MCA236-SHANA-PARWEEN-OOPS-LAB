import java.util.*;
public class MapInterface {
	public static void main (String args[])
	{
		Map<Integer,String> hm=new HashMap<>();

		 hm.put(1, "Shana");
	        hm.put(2, "Anju");
	        hm.put(3, "Sahala");
	        System.out.println("Initial Map is: "+ hm);
	        
	        hm.put( (2), "Amrutha");
	        hm.put((4), "Soniya");
	        //Updating..
	        System.out.println("Updated Map is: " + hm);
	  
	        //Removing..
	        hm.remove(4);
	  
	        // Final Map..
	        System.out.println("After Removing the fourth entry, Final Map is : "+hm);
	}

}
