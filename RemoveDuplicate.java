package Basics;
import java.util.Scanner;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter the string");
				String s = sc.nextLine();
				int n = 0;
				int c = 0;
				char[] l = new char[s.length()];
				for (int i = 0; i < s.length(); i++) {

					for (int j = i + 1; j < s.length(); j++) {
						if (s.charAt(i) == s.charAt(j))
							n++;
					}
					if (n == 0)
					{
						l[c] = s.charAt(i);
						c++;
					}
					n = 0;
				}System.out.print(l);
				sc.close();}}
			

		

	
