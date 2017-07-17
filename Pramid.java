import java.util.*;
@SuppressWarnings("unused")
public class Pramid {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
String ans="";
for(int i=0;i<a;i++){
	 for(int l=0;l<2;l++){
	      for(int j=i;j<a;j++){
System.out.print("*");
	            }
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
 
}
}