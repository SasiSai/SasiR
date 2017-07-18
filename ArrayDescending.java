package Basics;
import java.util.Arrays;
public class ArrayDescending {

	public static void main(String[] args) {
	int a[]={89,45,96,32,12,74,88};
	Arrays.sort(a);
	for(int j=a.length-1;j>=0;j--)
	{
	System.out.println(a[j]);
	}
	}

}
