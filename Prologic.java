import java.util.*;
public class Prologic {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the 2 elements");
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	int l1 = s1.length();
	int l2 = s2.length();
	String smName = "";
	String laName = "";
	if(l1 < l2) {
		laName = s2;}
	else {
		smName = s2;}
	if(l1 > l2) {
		laName = s1;}
	else {
		smName = s1;}
	if(l1 == l2) {
		for(int i = 0; i < l1; i++) {
			if(s1.charAt(i) > s2.charAt(i)) {
				smName = s1;}
			else {
				laName=s2;}}}
	System.out.print("PIN = ");
	String pin = sc.next();
	System.out.print("n = ");
	int n = sc.nextInt();
	String num1 = pin.substring(n-1, n);
	String rev = new StringBuffer(pin).reverse().toString();
	String num2 = rev.substring(n-1, n);
	String tog = laName.substring(0, 1)+smName;
	char[] ch = tog.toCharArray();
	for(int j  = 0; j < tog.length(); j++) {
	if(Character.isUpperCase(ch[j])) {
		ch[j] = Character.toLowerCase(ch[j]);
	}
	else {
		ch[j] = Character.toUpperCase(ch[j]);
	}
	}
	String userid = new String(ch);
	System.out.println(userid+num1+num2);
}

}

