package pro;
import java.util.*;
public class Ahun2 {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	String s=sc.nextLine();
int m=s.length();
    System.out.println("length of number" +m);
         int g,n,k, j=0;
	for(int i=0;i<m;i++)
	{
	g=s.charAt(i)-'0';
         n=s.charAt(i+1)-'0';  
           k=pow2(g,n);
                j=j+k;
                 System.out.println(j);}}
 static  int pow2(int g,int n){
    int total=1;
    for(int i=1;i<=n;i++){
        total*=g;}
    return total;
	
	
	}
}
