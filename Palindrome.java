package String;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner s=new Scanner(System.in);
		String x=s.nextLine();
		StringBuffer str=new StringBuffer(x);
		StringBuffer str1=new StringBuffer(str);
		str.reverse();
		if(String.valueOf(str).compareTo(String.valueOf(str1))==0)
		{
			System.out.println("The given string is palindrome");}
			else
			{System.out.println("The given string is not a palindrome");
		}
		

	}

}
