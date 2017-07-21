import java.util.*;
public class SumOfPower {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number here");
		int n=sc.nextInt();
		int index=0,sum=0;
		int remind[]=new int[String.valueOf(n).length()];
		while(n>0) {
			remind[index++]=n%10;
			n/=10;}
		for(int i=0;i<index-1;i++) {
			sum+=Math.pow(remind[i], remind[i+1]);}
		System.out.println(sum+1);

	}

}
