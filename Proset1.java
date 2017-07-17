import java.util.*;
public class Proset1 {
@SuppressWarnings({ "resource", "unused" })
public static void main(String[] args) {
	int n,d;
    int co=0,a,i,z,sm=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int length=(int)(Math.log10(n)+1);
     System.out.println(""+length);
    for(i=0;n<length;i++){
    while(n>0)
             {
        d=n%10;
        a=length;
        z=d^a;
        sm=sm+z;
        System.out.println(""+sm);
        co++;}}

}
}
