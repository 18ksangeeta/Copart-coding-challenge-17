import java.util.Scanner;

public class StringToInt {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		//code that check the string ascii value matches with the ascii value of intergers
		// if matches prints the respective numbers
		// the code accepts the string that has numbers and normal text as well
		// but only prints the numbers present in the string
		for(int i=0;i<str.length();i++){
			switch(str.charAt(i)){
			case 48:
				System.out.print(0);
				break;
			case 49:
				System.out.print(1);
				break;
			case 50:
				System.out.print(2);
				break;
			case 51:
				System.out.print(3);
				break;
			case 52:
				System.out.print(4);
				break;
			case 53:
				System.out.print(5);
				break;
			case 54:
				System.out.print(6);
				break;
			case 55:
				System.out.print(7);
				break;
			case 56:
				System.out.print(8);
				break;
			case 57:
				System.out.print(9);
				break;
			default:
				break;
			}
		}
	}
}
