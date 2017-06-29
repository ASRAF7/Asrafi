import java.util.*;
public class Afact {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers");
	int n=sc.nextInt();
	int re=0;
	while(n!=0){
		re=re*10;
	re=re+n%10;
	n=n/10;}
	System.out.println(re);



}
}
