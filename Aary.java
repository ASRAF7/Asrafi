import java.util.*;
public class Aary {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();}
  Arrays.sort(a);
for(int i=0;i<n;i++)
{
if(a[i]==a[(i+1)%n]){
}
else if(a[i]==a[(i-1)%n]){
}
else
System.out.println(a[i]);
}
		           
	}

}
