package myproject;
import java.util.Scanner;

interface find
{
	void input();
	void area();
	void perimeter();
		
}

class Circle implements find
{
	double r, a, p;
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		r = sc.nextInt();
		
	}
	
	
	@Override
	public void area() 
	{
		
		a = 3.14 * r* r;
		System.out.println("Area of circle = " +a);
		
	}

	@Override
	public void perimeter()
	{
		p = 2 * 3.14 * r;
		System.out.println("Perimeter of cirlce = " +p);
		
	}

	
}

class Rectangle implements find
{
	int l,b,a1,p1;
	@Override
	public void input() 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle :");
		l = sc1.nextInt();
		System.out.println("Enter the breadth of the rectangle : "); 
		b = sc1.nextInt();
		
	}
	
	@Override
	public void area()
	{
		a1 = l *b;
		System.out.println("Area of rectangle = " +a1);
		
	}

	@Override
	public void perimeter() 
	{
		p1 = 2 * (l + b);
		System.out.println("Perimeter of rectangle = " +p1);
		
	}

	
	
}

public class Interface 
	{

		public static void main(String[] args)
		{
			
			Circle obj1 = new Circle();
			obj1.input();
			obj1.area();
			obj1.perimeter();
			System.out.println();
			Rectangle obj = new Rectangle();
			obj.input();
			obj.area();
			obj.perimeter();
			
			
			

		}

}
