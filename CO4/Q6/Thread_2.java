import java.util.Scanner;

class Fib implements Runnable{
	public void run(){
		int a=0,b=1,c=0,n=30;
		System.out.println("Fibonacci Series upto "+n+":\n");
		while (n>0)
        {
             System.out.print(c+" ");
             a=b;
             b=c;
             c=a+b;
             n=n-1;
        }
		System.out.println("\n\n*************************\n");
	}
}

class EvenNo implements Runnable{
	public void run(){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of N:");
		n=sc.nextInt();
		System.out.println("Even Numbers from 1 to "+n+":");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
				}
			}
		}
}
public class Thread_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fib obj=new Fib();
		Thread t=new Thread(obj);
		t.start();
		
		EvenNo obj1=new EvenNo();
		Thread t1=new Thread(obj1);
		t1.start();
	}

}
