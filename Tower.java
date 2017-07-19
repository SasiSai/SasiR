import java.util.Scanner;
public class Tower {
public static void main(String[] args) {
System.out.println("Enter the word");
Scanner s=new Scanner(System.in);
String str=s.next();
if(str.length()>1)
{
	System.out.println(str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0));
}else
{
	System.out.println(str);
}}
}
