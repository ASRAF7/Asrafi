import java.util.*;
public class HunCount {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int[] sa=new int[n];
System.out.println("enter the elements of array");
for(int i=0;i<n;i++) {
	sa[i]=sc.nextInt();
}for(int i=0;i<n;i++) {
System.out.println(sa[i]);}
System.out.println("Enter the number:");
int num=sc.nextInt();
int count=0;
for(int i=0;i<n;i++){
	if(num==sa[i]){
		count++;
	}
}System.out.println("count:"+count);
	}

}
