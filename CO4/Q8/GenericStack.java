import java.util.Scanner;
class stack 
{
int a[] = new int[20];
int top=-1,ch,item,i;
Scanner sc = new Scanner(System.in);

public void stackoperations()
{
	System.out.println("***GENERIC STACK PROGRAM*** ");
	System.out.println("Enter the size of the array : ");
	int n=sc.nextInt();
do
{
System.out.println("\n\t ********************STACK OPERATIONS******************** ");
System.out.println("\n 1.PUSH \n 2.POP \n 3.EXIT \n");
System.out.println("\n Enter your choice : ");
ch=sc.nextInt();
switch(ch)
{
case 1: 
	if(top >=n-1)
        {
		System.out.println("Stack Overflow!!!");
        }
        else
        {
        System.out.println("Enter the element to be inserted :");
        item =sc.nextInt();
        top=top+1;
        a[top]=item;
        }
        break;
case 2 : 
	if(top<0)
         {
		 System.out.println("Stack Underflow!!!");
         }
         else
         {
        	 item=a[top];
         a[top]='\0';
         top=top-1;
         System.out.println("Deleted element is "+item);
         }
         break;
case 3 : 
	break;
default : 
	System.out.println("\n Invalid Choice!!!");
}
if(top < 0)
{
System.out.println("\n Stack is Empty!!!");
}
else
{
System.out.println("\n Stack elements are: ");
for(i=top;i>=0;i--)
{
System.out.println(a[i]);
}
}
}
while(ch!=3);
}
}
public class GenericStack {

	public static void main(String[] args) {
		
		stack a =new stack();
		a.stackoperations();

	}
}
