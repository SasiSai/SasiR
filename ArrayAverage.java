package Basics;
import java.util.Scanner;
public class ArrayAverage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		int arr[]=new int[5];
		int f=0;
		int s=0;
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
		f+=arr[i];
		}
		for(int i=3;i<5;i++)
		{
			s+=arr[i];
		}
		if((f/3)==(s/2))
		{			
			System.out.println("["+arr[0]+","+arr[1]+","+arr[2]+"]"+" "+"["+arr[3]+","+arr[4]+"]");
		}
		else
		{
			System.out.println("Not Possible");
		}
	}
}
