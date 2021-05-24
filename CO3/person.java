import java.util.Scanner;
public class person {
	String Name;
	String Gender;
	String Address;
	int Age;
	
	public person(String n,String g,String a,int age) 
	{
		Name=n;
		Gender=g;
		Address=a;
		Age=age;
				
	}
	static class Employee extends person
	{
		 int Empid;
		 String company_name;
		 String Qualification;
		 double Salary;
		 
		
		  	
	   public Employee(String n,String g,String a,int age,int id,String c,String q,double s)
	   {
	
		    super(n,g,a,age);
	    	Empid = id;
	    	company_name = c;
	    	Salary = s;
	    	Qualification = q;
	    	  
	}
	   
	   static class Teacher extends Employee
	   {
			 int teacher_id;
			 String department;
			 String subject;
			
		 public Teacher(String n,String g,String a,int age,int id,String c,double s,String q, int id1,String d,String sub) {
			  super(n,g,a,age,id,c,q,s);
			  teacher_id=id1;
				department=d;
				subject=sub;
				
			} 

		 void Display()
			{
				System.out.println("****Person Details****");
				System.out.println("Person Name: "+Name);
				System.out.println("Gender: "+Gender);
				System.out.println("Person Address: "+Address);
				System.out.println("Person's Age : "+Age);
				System.out.println("Employee details: ");
				System.out.println("Employee id: "+Empid);
				System.out.println("Company Name: "+company_name);
				System.out.println("Salary: "+Salary);
				System.out.println("Qualification: "+Qualification);
				System.out.println("Teacher's details: ");
				System.out.println("Teacher id: "+teacher_id);
				System.out.println("Department: "+department);
				System.out.println("Subject: "+subject);
			}
		  }
	   
	   
	public static void main(String[] args) 
	{
		int i,count;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of Person: ");
		count=sc.nextInt();
        Teacher t[]=new Teacher[count];
        
   
        for(i=0;i<count;i++) 
		{   
        	
        	System.out.println("Enter the Person Name:");
 		   String n1= sc.next();
 		   System.out.println("Enter the Gender:");
 		    String g1 = sc.next();
 		   System.out.println("Enter the Address:");
 		    String a1= sc.next();
 		   System.out.println("Enter the age:");
 		    int age1= sc.nextInt();
        	System.out.println("Enter the Employee id:");
		   int id1= sc.nextInt();
		   System.out.println("Enter the Company name:");
		    String cn= sc.next();
		   System.out.println("Enter the Salary:");
		    int s1= sc.nextInt();
		   System.out.println("Enter the Qualification:");
		    String q1= sc.next();
		    System.out.println("Enter the Teacher id:");
		    int tid= sc.nextInt();
		   System.out.println("Enter the Department:");
		   String dept1= sc.next();
		   System.out.println("Enter the Subject:");
		   String sub1= sc.next();
		   
		   
		   t[i]=new Teacher(n1,g1,a1,age1,id1,cn,s1,q1,tid,dept1,sub1);

	}
        for( i=0;i<count;i++)
        {
            t[i].Display();
        }

}
	}
}
