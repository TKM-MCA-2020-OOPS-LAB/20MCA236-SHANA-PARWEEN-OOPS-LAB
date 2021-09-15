import java.io.*;

 class odd_even
{
public static void main(String args[]) throws IOException { 
     FileInputStream fr = new FileInputStream("numbers.txt");
     FileOutputStream fw1 = new FileOutputStream("even numbers.txt");
     FileOutputStream fw2 = new FileOutputStream("odd numbers.txt");
     System.out.println("***ODD AND EVEN NUMBERS ARE COPIED TO SEPARATE FILES***"); 
     int i;
     while((i=fr.read()) != -1) 
    	  
     {
      if(i%2==0)
      fw1.write(i);
      else
      fw2.write(i);
     }
     
     fr.close();
     fw1.close();
     fw2.close();
     
 }
}