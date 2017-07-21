import java.util.*;
public class Sum {
@SuppressWarnings({ "resource", "unused" })
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	int a=in.nextInt();
 int b=a,len=0, c, d=0, sum=0;
	while(a>0){
		a=a/10;
		++len;}
	int k=1;
	while(b>0){
		c=b%10;
		b=b/10;
		sum= sum+k*c;
	    k++;}
	System.out.println(sum);

	}

}
