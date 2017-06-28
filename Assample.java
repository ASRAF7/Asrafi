import java.util.*;
public class Assample {
public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("enter the string \n");
String s1=sc.nextLine();
StringBuffer sa=new StringBuffer(s1);
sa.reverse();
System.out.println("the reversed string is "+sa);


}
}
