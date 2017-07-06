import java.util.*;
public class Hunter4 {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the digits");
    int n=sc.nextInt();
    int input = n;
    int sum=0;
    while (input != 0) {
    	int l = input % 10;
    	sum += l; 
    	input /= 10; }
    System.out.println(sum);
int r,s=0,temp;    
  temp=sum;    
while(sum>0){    
 r=sum%10;  //getting remainder  
 s=(s*10)+r;    
 sum=sum/10;    
}    
if(temp==s)    
 System.out.println("palindrome number ");    
else    
 System.out.println("not palindrome");    

}  
}  


