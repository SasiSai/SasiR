package LP;
public class Encryption {
	public static String output;
	public static void main(String[] args)
	{
	userMethod("SaSiKumaR");
	System.out.println(output);	
	}
	public static void userMethod(String input)
	{
		String str=input.toLowerCase();
		int index[]=new int[str.length()];
		int result[]=new int[str.length()];
		String a="abcdefghijklmnopqrstuvwxyz";
		char ch[]=a.toCharArray();
		String n="";
		String []st=new String[input.length()];	
		int l=a.lastIndexOf(str.substring(str.length()-1,str.length()))+1;
		for(int i=0;i<str.length();i++)
		{
			index[i]=a.indexOf(str.substring(i,i+1))+1;
		}
	    for(int i=0;i<str.length()-1;i++)
		{
			if(index[i]>l)
			{
			  result[i]=(index[i]-l);
			}
			else if(index[i]<=l)
			{
				result[i]=(index[i]-l)+26;
			}
		}
		for(int i=0;i<str.length()-1;i++)
		{
			  char c=ch[result[i]-1];
              st[i]=Character.toString(c);
		}
		for(int i=0;i<input.length()-1;i++)
		{
			 if(Character.isUpperCase(input.charAt(i)))
			 {
			   st[i]= st[i].toUpperCase();
			 }     
		}
		for(int i=0;i<str.length()-1;i++)
		{
			 n=n+st[i];
		}
		output=n+""+input.substring(input.length()-1,input.length());
     }
}
