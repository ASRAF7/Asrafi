import java.util.*;
public class Aarray {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int[] s=new int[n];
System.out.println("enter the element of array");
for(int i=0;i<n;i++){
	s[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(s[i]==s[j])
			System.out.println("the reapeted elements are "+s[i]);
	}
}

	}
}
