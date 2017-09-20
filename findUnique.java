package Guvi;
import java.util.*;
public class findUnique {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int count[] = new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i] = sc.nextInt();
    	count[a[i]]++;
    }
    for(int i=0;i<n;i++)
    {
    	if(count[a[i]]==1)
    	{
    		System.out.println(a[i]);
    	}
    }
    
    sc.close();
    
	}

}
