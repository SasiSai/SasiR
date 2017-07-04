package Basics;
import java.util.Scanner;
import java.util.*;
public class DigitCount {
	public static void main(String[] args) {
		System.out.println("Enter the size:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int c=0,i;
	for( i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		int length = (int)(Math.log10(a[i])+1);
			for(int j=0;j<length;j++)
			{
				int arr[]=new int[length];
				arr[j]=a[i]%10;
				a[i]=a[i]/10;
				for(int k=0;k<10;k++)
				{
				if(a[j]==k)
				{
					c++;
				}
				System.out.println(k+" is "+c+" times");
			}
	}}}
}