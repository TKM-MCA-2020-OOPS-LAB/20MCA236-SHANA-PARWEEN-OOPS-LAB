package myproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class bill {
	public static void main(String[] args) 
	{
		first obj1=new first();
		second obj2=new second();
		obj1.total();
		obj2.total();
		obj2.display();
	}

}

interface calculate
{
	void total();
}
class first implements calculate
{
	int id=101,q=2,u=25,sum;
	String n="A";
	
	public void total()
	{
		sum=q*u;
	}
}
class second extends first implements calculate
{
	int product_id=102,quantity=1,unit_pr=100,total;
	String name="B";
	DateFormat df=new SimpleDateFormat("dd/MM/yy");
	Date d= new Date();
	@Override
	public void total()
	{
		super.total();
		total=quantity*unit_pr;
	}
	public void display()
	{
		System.out.println("Order No.458\n");
		System.out.println("Date: "+df.format(d));
		System.out.println("\nProduct Id\t\tName\t\t\tQuantity\t\t\tunit price\t\t\tTotal");
		System.out.println("_______________________________________________________________________________________________________________________________");
		System.out.println(id+"\t\t\t"+n+"\t\t\t"+q+"\t\t\t\t"+u+"\t\t\t\t"+sum);
		System.out.println(product_id+"\t\t\t"+name+"\t\t\t"+quantity+"\t\t\t\t"+unit_pr+"\t\t\t\t"+total);
		System.out.println("________________________________________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\tNet. Amount"+"\t\t\t\t"+(sum+total));
		
	}
}
