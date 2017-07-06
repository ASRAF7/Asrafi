import java.util.*;
public class Abg2 {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the String");
String s=sc.nextLine();
s= s.replaceAll ( "[AEIOUaeiou]" , " ");
System.out.println(s);
}

}
