package sringmani;

public class stringmani {
	public static void main(String[] args) {
		
        String str1="OOPS";
    String str2="Programming lab";
    System.out.println("String 1: " + str1);
    System.out.println("String 2: " +str2);
    
    //String Manipulations
    
    //1.CONCATENATION
    String str3=str1.concat(str2);
    System.out.println("1. After Concatenation of str1 & str2: "+str3);
    
  //Length of a String
    System.out.println("2.Length of String 1: " + str1.length());
    
    //3.CHARACTER AT
    System.out.println("3.Character at position 2 of String 1: " + str1.charAt(2));
    
    //4.INDEX OF
    System.out.println("4.Index of Char 'a' in String 2 : " + str2.indexOf('a'));
    
    //5.COMPARE TO
    System.out.println("5.Compare To 'String 2: " + str1.compareTo(str2));
    
    //6.COMPARE TO IGNORE CASE
    System.out.println("6.Compare To 'PROGRAMS' with String 2 - Case Ignored: " + str2.compareToIgnoreCase("Programs"));
    
    //7.CONTAIN
    System.out.println("7.Contains sequence 'GRAM' in String 2: " + str2.contains("ram"));
    
    //8.ENDS WITH
     System.out.println("8.EndsWith character 'S' in String 1 : " + str1.endsWith("S"));
     
     //9.REPLACE ALL
     System.out.println("9.Replace 'OOPS' with 'JAVA': " + str1.replaceAll("OOPS","JAVA"));
     
     //10.TO LOWERCASE
     System.out.println("10.Convert to LowerCase String 1: " + str1.toLowerCase());
     
   //11.TO UPPERCASE
     System.out.println("11.Convert to UpperCase String 2: " + str2.toUpperCase());
     
	

}


}
