package publisher;

import java.util.Scanner;

public class publisher {
	String pname;
	Scanner sc=new Scanner(System.in);
	
	publisher()
	{
		System.out.println("Enter publisher name");
		pname=sc.nextLine();
	
	}
}

class book extends publisher {
	String bname,author;
	int page;
	Scanner sc1=new Scanner(System.in);
	
	book() {
		System.out.println("Enter Book name");
		bname=sc1.nextLine();
		System.out.println("Enter author");
		author=sc1.nextLine();
		System.out.println("Enter page");
		page=sc1.nextInt();
	}
}

class literature extends book {
	String language;
	Scanner sc2=new Scanner(System.in);
	
	literature() {
		System.out.println("Enter which language");
		language=sc2.nextLine();
	}
	void display()
	{
		System.out.println("................LITERATURE BOOKS ARE..............");
		System.out.println("Publisher name is "+pname);
	       System.out.println("Book name is "+bname);
		System.out.println("Autho name is "+author);
		System.out.println("Page is "+page);
		
	}
}


class fictions extends book {
	String language;
	Scanner sc3=new Scanner(System.in);
	
	fictions() {
		System.out.println("Enter which language");
		language=sc3.nextLine();
	}
	void display()
	{
		System.out.println("................FICTION BOOKS ARE..............");
		System.out.println("Publisher name is "+pname);
		System.out.println("Book name is "+bname);
		System.out.println("Author name is "+author);
		System.out.println("Page is "+page);
		
	}

	public static void main(String[] args) {
		int n,m,c;
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter number of literatures books");
		n=sc4.nextInt();
		literature l[]=new literature[n];
		for(int i=0;i<n;i++) {
			l[i]=new literature();
		}
		System.out.println("Enter number of fictions books");
		m=sc4.nextInt();
		fictions f[]=new fictions[m];
		for(int i=0;i<m;i++) {
			f[i]=new fictions();
		}
		System.out.println("Enter your Choice \n1:LITERATURE\n2:FICTION");
		c=sc4.nextInt();
		if(c==1) {
			for(int i=0;i<n;i++) {
				l[i].display();
			}
		}
		else if(c==2) {
			for(int i=0;i<n;i++) {
				f[i].display();
		}
	}
		else
			System.out.println("you are wrong");
	sc4.close();
	}
}
