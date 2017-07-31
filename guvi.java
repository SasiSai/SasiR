import java.util.*;
public class Guvi {
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str=in.next();
	String sub = null;int t,l=str.length();
        for(int i=1;i<l;i++){
	   t=str.charAt(i)-str.charAt(i-1);
	         if(t!=-1){
			 sub=str.substring(i);
			 break;	}
	if(sub.length()!=0)
          System.out.println("Lexographic Substring:"+sub);
	
	else
	  System.out.println( String can't be formed");
    }}}
