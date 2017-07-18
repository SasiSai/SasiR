package Basics;
import java.util.Scanner;
public class SeedNumber {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the seed number");
int number=s.nextInt();
int t=number;
int result=number;
while(number != 0)
{
	int temp=number%10;
	t=t*temp;
	number/=10;
}System.out.println(t);
}
}
