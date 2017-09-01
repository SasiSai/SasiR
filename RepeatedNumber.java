package Guvi;

import java.util.Scanner;

public class RepeatedNumber {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int c[] = new int[n];
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i] == arr[j])
			{
				c[i]++;
			}
		}
		
	}
	for(int i=0;i<n;i++)
	{
		if(c[i]>0)
		System.out.println(arr[i]);
	}
	
}
}
