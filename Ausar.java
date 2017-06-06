package user;
import java.util.Scanner;
public class Ausar {
public static void main(String[] args) {
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	if(c=='q')
		{System.exit(0);}
	else
	{ System.out.println("hello");}

	}

}
