import java.util.*;
public class Abg1 {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the day");
String dy=sc.nextLine();
String a="sunday";
String b="saturday";
if(dy.equals(a) || dy.equals(b)) {
	System.out.println("false");}
else {
	System.out.println("true");
}


}
}
