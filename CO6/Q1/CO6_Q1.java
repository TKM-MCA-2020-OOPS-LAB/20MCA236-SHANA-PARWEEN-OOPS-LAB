import java.io.File;

class CO6_Q1 {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:\\Users\\Shana Parween\\Desktop\\OOPS CO5");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}