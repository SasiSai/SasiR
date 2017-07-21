package Basics;

import java.util.Scanner;

public class SquarePoints {

	public static void main(String[] args) {
		System.out.println("Enter the four points (a,b)");
		Scanner sc=new Scanner(System.in);
     int a1=sc.nextInt();
     int a2=sc.nextInt();
     int b1=sc.nextInt();
     int b2=sc.nextInt();
     int c1=sc.nextInt();
     int c2=sc.nextInt();
     int d1=sc.nextInt();
     int d2=sc.nextInt();
     sc.close();
     if(a2==b1 && b2==c1 && c2==d1 && d2==a1)
     {
    	 System.out.println("Square");
     }
     else
     {
    	 System.out.println("Not a Square");
     }
	}

}
