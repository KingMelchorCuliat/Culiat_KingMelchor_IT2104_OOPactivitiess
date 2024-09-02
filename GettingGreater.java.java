import java.util.Scanner;

public class GettingGreater {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Getting the Greater Value");

		System.out.print("Enter the first character: ");
		char ch1 = input.next().charAt(0);

		System.out.print("Enter the first character: ");
		char ch2 = input.next().charAt(0);

		int max1 = ch1;
		int max2 = ch2;
		int max = Math.max(max1, max2);
		
		char maxchar = (char) max;
		
		System.out.println("--------------------------------------------");
		System.out.println("The character with a greater value is: " + maxchar);
        System.out.println("--------------------------------------------");
        
        System.out.println("Showing the ASCII Codes");
        
		System.out.println(ch1 +":" + max1);
		System.out.println(ch2 +":"+ max2);


	}
}