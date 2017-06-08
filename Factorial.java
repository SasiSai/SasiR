package Basics;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args)
{
	int n,r=1;
	System.out.println("Enter the input");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		r=r*i;
	}
	System.out.print("The Factorial of the input is "+r);}
}
