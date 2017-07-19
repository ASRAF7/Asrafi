import java.util.*;
public class RemoveChar {
@SuppressWarnings("resource")
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the String");
String s1=sc.next();
String result=" ";
for(int i=0;i<s1.length();i++){
int	count=0;
	for(int j=0;j<s1.length();j++){
		if(s1.charAt(i)==s1.charAt(j)){
			count=count+1;}
	}
	if(count==1){
		result=result+s1.charAt(i);}
}String s2=s1.substring(0, 1)+result;
System.out.println(s2);
	}

}