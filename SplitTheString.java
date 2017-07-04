package Basics;

import java.util.Scanner;

public class SplitTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the String");
String str=s.next();
int l=str.length();
char ch[];
ch=str.toCharArray();
int count=1;
int k=0;
int m=0;
for(int i=0;i<l-1;i++)
{for(int j=i+1;j<l;j++)
{
	 if(ch[i]==ch[j])
	 {
		 count++;
	 }
	 
} if(count>k)
{
	m=i;
	k=count;
	}count=1;
}System.out.println(ch[m]+" occurs "+k+" times");



}}
