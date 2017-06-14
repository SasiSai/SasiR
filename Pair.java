package Basics;
import java.util.Scanner;
public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter the no.of students and pair");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int p=s.nextInt();
for(int i=0;i<2*n;i++){
	int d=2*n-i;
	if(p!=d)
	{   for(int j=1;j<=n;j++)
		System.out.println(j+":"+p+"Pair");
	
	}
	}

	}}
