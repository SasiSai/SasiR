package third;

import java.util.Scanner;

public class ArrayAddition {
	
		 public static void main(String[] args)
		 {
		   System.out.println("Enter the size");
		   Scanner s=new Scanner(System.in);
		   int n=s.nextInt();
		   int[] Arr=new int[n];
		   System.out.println("Enter the elements");
		   for(int i=0;i<n;i++)
		    {
		     Arr[i]=s.nextInt();
		    }
		   for(int i=0;i<n;i++)
		   {
		       for(int j=0;j<n;j++)
		       {
		           for(int k=0;k<n;k++)
		            {
		              if((Arr[i]+Arr[j])==Arr[k])
		                System.out.println(Arr[i]+Arr[j]+Arr[k]);
		            }
		       }s.close();
		     }  
		   }
		}   

