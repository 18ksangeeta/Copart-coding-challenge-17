import java.util.Scanner;
import java.lang.*;

public class StringToInt {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		//code that check the string ascii value matches with the ascii value of intergers
		// if matches prints the respective numbers
		// the code accepts the string that has numbers and normal text as well
		// but only prints the numbers present in the string
		int number=0, count=str.length()-1;
		for(int i=0;i<str.length();i++){
			switch(str.charAt(i)){
			case 48:
				number = (int) (number+(0*Math.pow(10,count)));
				
				break;
			case 49:
				number = (int) (number+(1*Math.pow(10,count)));
				
				break;
			case 50:
				number = (int) (number+(2*Math.pow(10,count)));
				
				break;
			case 51:
				number = (int) (number+(3*Math.pow(10,count)));
				
				break;
				
			case 52:
				number = (int) (number+(4*Math.pow(10,count)));
				
				break;
			case 53:
				number = (int) (number+(5*Math.pow(10,count)));
				
				break;
			case 54:
				number = (int) (number+(6*Math.pow(10,count)));
				
				break;
			case 55:
				number = (int) (number+(7*Math.pow(10,count)));
				
				break;
			case 56:
				number = (int) (number+(8*Math.pow(10,count)));
				
				break;
			case 57:
				number = (int) (number+(9*Math.pow(10,count)));
				
				break;
			default:
				break;
			}
			count--;

			
		}
		System.out.println();
		System.out.println(number);
	}
}
