package Basics;
import java.util.Scanner;
public class SortDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sorted = 0;
		int digits = 10;
		int sortedDigits = 1;
		boolean first = true;

		while (number > 0) {
		    int digit = number % 10;

		    if (!first) {

		        int tmp = sorted;
		        int toDivide = 1;
		        for (int i = 0; i < sortedDigits; i++) {
		            int tmpDigit = tmp % 10;
		            if (digit >= tmpDigit) {
		                sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
		                break;
		            } else if (i == sortedDigits-1) {
		                sorted = digit * digits + sorted;
		            }
		            tmp /= 10;
		            toDivide *= 10;
		        }
		        digits *= 10;
		        sortedDigits += 1;
		    } else {
		        sorted = digit;
		    }

		    first = false;
		    number = number / 10;
		}
		System.out.println(sorted/1000);
	}

}
