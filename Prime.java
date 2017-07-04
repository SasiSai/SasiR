package FlowControl;
import java.util.Scanner;
public class Prime {
public static void main(String[] args)
{
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	
	int c=0;
	int a=s.nextInt();
	for(int i=2;i<a;i++){
		
	if((a%i)==0)
	{
	 c++;
	 break;
	}}if(c==0)
	{
		System.out.print("The given number is prime number");
	}
	else
	{
		System.out.print("The given number is not a prime number");
	}
}
}
