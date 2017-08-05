package Basics;
import java.util.*;
public class WordConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String"); 
		String str1 = sc.next();
		StringBuilder str = new StringBuilder(str1);
		int con=1;
		int cost=0;
		while(con==1)
		{
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Replace");
			System.out.println("Enter your choice"); 
			int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("It costs 4\nEnter the position and the character you want to Insert");
			int pos = sc.nextInt();
			String s = sc.next();
            str.insert(pos-1, s);
			System.out.println(str);
			cost+=4;
			System.out.println("To continue press '1' otherwise press '0'");
			con = sc.nextInt();
			break;
		case 2:
			System.out.println("It costs 3\nEnter the position you want to Delete");
		    pos = sc.nextInt();
		    str.deleteCharAt(pos-1);
		    System.out.println(str);
		    cost+=3;
			System.out.println("To continue press '1' otherwise press '0'");
			con = sc.nextInt();
			break;
		case 3:
			System.out.println("It costs 5\nEnter the position and the character you want to Replace");
		    pos = sc.nextInt();
		    String st = sc.next();
		    str.replace(pos-1, pos, st);
		    System.out.println(str);
		    cost+=5;
			System.out.println("To continue press '1' otherwise press '0'");
			con = sc.nextInt();
            break;
		}}
		System.out.println("Total cost is: "+cost);
	}

}
