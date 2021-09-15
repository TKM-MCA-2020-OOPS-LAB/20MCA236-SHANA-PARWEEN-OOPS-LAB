import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class write_read {
	 public static void main(String[] args) {

	  try {
          FileWriter writer = new FileWriter("C:\\Users\\Shana Parween\\Desktop\\OOPS CO5\\OOPS CO6\\q6.txt",true);
          writer.write("SHANA PARWEEN\n");
          writer.close();
          FileReader reader = new FileReader("C:\\Users\\Shana Parween\\Desktop\\OOPS CO5\\OOPS CO6\\q6.txt");
          BufferedReader br= new BufferedReader(reader);
          String line;
          System.out.println("\n  Read Data From The  File \n");
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
          reader.close();

      } catch (IOException e) {
          System.out.println("\n *****Error*****");
      }

  }


}