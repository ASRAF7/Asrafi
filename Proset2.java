import java.util.*;
public class Proset2 {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the seed");
int n=sc.nextInt();
int r,as=1;
int m=n;
while(n!=0) {
	r=n%10;
	n=n/10;
	as=as*r;
}
System.out.println(m +"the seeds of "+as*m);

}
}
