package ak;
import java.util.Scanner;
public class Oddoreven {

	public static void main(String[] args) {		
		int a;
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);
		 a = input.nextInt();
		if(a%2==0)
			System.out.println("it's even");
		else
			System.out.println("it's odd");
	}

}
