import java.util.*;
public class Hunter2 {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int[] s=new int[n];
System.out.println("enter the elements of array");
for(int i=0;i<n;i++){
	s[i]=sc.nextInt();}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
	if(s[i]>s[j]){
		int temp=s[i];
		s[i]=s[j];
		s[j]=temp;}
}
}System.out.println("the sorted array are");
for(int i=0;i<n-1;i++){
	System.out.println(s[i]);
}
System.out.println(s[n-1]);
for(int i=0;i<s.length;i++){
	if(s.length==n){
		System.out.println("the index of "+n+"is equal to "+ s.length+"true");}
	else{
		System.out.println("the index of "+n+"is  not equal to "+ s.length+"false");
	}
		
}
}
}
