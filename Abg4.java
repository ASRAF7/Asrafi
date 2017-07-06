import java.util.*;
public class Abg4 {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int s=sc.nextInt();
System.out.println("enter the elements of array");
int[] n=new int[s];
for(int i=0;i<s;i++) {
	n[i]=sc.nextInt();}
for(int i=0;i<s;i++) {
	System.out.println(n[i]);
}

}
}
