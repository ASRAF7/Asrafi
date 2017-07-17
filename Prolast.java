import java.util.*;
public class Prolast {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String sa=sc.next();
	String sb="";
	int i=0;
	for(i=0;i<sa.length();i++){
		if(Character.isDigit(sa.charAt(i))){
			sb+=sa.charAt(i);				
		}
	}
	int num=Integer.parseInt(sb);
	int max=0;
	int min=9999;
	int n=0;
	int temp=num;
	while(num>0){
		n=num%10;
		if(n>max){
			max=n;
		}
		if(n<min){
			min=n;
		}
		num/=10;
	}
	int sum1=0;
	int sum2=1;
	while(temp>0){
		n=temp%10;
		sum1+=max*n;
		sum2*=min+n;
		temp/=10;
	}
	int add=0;
	while(sum1>9){
		add=0;
		while(sum1>0){
			add+=sum1%10;
			sum1/=10;
		}
		sum1=add;
	}
	int x=0;
	while(sum2>0){
		x+=sum2%10;
		sum2/=10;
	}
	if(sum1<x){
		System.out.println(sum1*sum1);
	}else
	{
		System.out.println(x*x);
	}
	sc.close();

	}

}
