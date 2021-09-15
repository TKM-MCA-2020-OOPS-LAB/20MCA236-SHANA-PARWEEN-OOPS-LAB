 import java.io.*;  
    import java.util.*;  
    class copy_file {  
     public static void main(String arg[]) throws Exception {  
      Scanner sc = new Scanner(System.in);  
      System.out.print("Source file name :");  
      String sfile = sc.next();  
      System.out.print("Destination file name :");  
      String dfile = sc.next();  
      FileReader fin = new FileReader(sfile);  
      FileWriter fout = new FileWriter(dfile, true);  
      int c;  
      while ((c = fin.read()) != -1) {  
       fout.write(c);  
      }  
      System.out.println("*****COPIED SUCCESSFULLY*****");  
      fin.close();  
      fout.close();  
     }  
    }   
