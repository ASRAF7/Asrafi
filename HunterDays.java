import java.util.*;
public class HunterDays {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the day");
String day=sc.next();
String s1="sunday";
String s2="saturday";
if((day.equals(s1))||(day.equals(s2))) {
	System.out.println("false");
}else {
	System.out.println("true");
}

	}

}
