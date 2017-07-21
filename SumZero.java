import java.util.*;
public class SumZero {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
System.out.println("enter the elements of array");
double[] s=new double[n];
for(int i=0;i<n;i++) {
	s[i]=sc.nextDouble();
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
{
      if(s[i]+s[j]==0 || ((s[i]+s[j]<1)&&(s[i]+s[j]>-1))) 
      {
       System.out.println("the elements are:"+s[i]+","+s[j]);
       }
}     
}

	}
}
