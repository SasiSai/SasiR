package FlowControl;
import java.util.Scanner;
public class Pos_Neg_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n==0)
{
	System.out.println("Zero");
}
else if(n>0)
	{System.out.println("Positive");
	}
	else if(n<0)
	{
		System.out.println("Negative");
	}
	}

}
