package Basics;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.nextLine();
String s1=str.replaceAll("[aeiouAEIOU]","");
StringBuffer s2=new StringBuffer(s1);
System.out.println(s2.reverse());
	}

}
