package Basics;
	import java.util.Scanner;

	public class Guvi_Chocolate {
		public static void main(String[] args) {
			System.out.println("Enter the rows and columns");
			Scanner sc=new Scanner(System.in);
			int l=sc.nextInt();
			int w=sc.nextInt();
			int cut=0;
			if(l!=0 && w!=0)
				cut=l*w-1;
			System.out.println("Total cuttings is "+cut);
		}}

