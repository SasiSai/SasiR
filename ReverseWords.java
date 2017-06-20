package Basics;
public class ReverseWords {

	public static void main(String[] args){
String str[]={"Java","is","a","programming","language"};
String rev="";
for(int i=str.length-1;i>=0;i--)
{
	
	rev +=str[i]+" ";
	
}System.out.print(rev);
}

}
