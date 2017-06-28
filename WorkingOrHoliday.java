package Basics;
import java.util.Scanner;
public class WorkingOrHoliday {

	public static void main(String[] args) {
	System.out.println("Enter the day");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
    String str=s.toLowerCase();
	if(str.equals("sunday"))
	{
	System.out.print("false");
	}
	else
	{
		System.out.print("true");
	}
	 
	
	}

}
