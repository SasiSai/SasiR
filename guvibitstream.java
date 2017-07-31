import java.util.*;
public class GuviBitStream {
    import java.util.Scanner;

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=(int) Math.pow(2,n);
		for(int i=0;i<m;i++)
		{
		String str=Integer.toBinaryString(i);
		System.out.print(str);
		if(str.length()!=n)
		{
		for(int j=0;j<(n-str.length());j++)
                System.out.print("0");
		}
		System.out.println();
		}

	}

}

