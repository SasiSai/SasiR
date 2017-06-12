package FlowControl;
import java.util.Scanner;
public class ReverseInt {

	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		while(n!=0)
		{
			 int y=n%10;
		     n=n/10;
             k=k*10+(y);
		}
System.out.println(k);
	}

}
