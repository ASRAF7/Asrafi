import java.util.*;
public class ShortPolindrome {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String myString=sc.next();
	 String finalResult = "";
	    String temp = "";
	    String rev = "";
	    for (int i = myString.length() - 1; i >= 0; i--) {
	        rev += myString.charAt(i);
	        temp = rev + myString;
	        if (check(temp) == true) {
	            finalResult = temp;
	            break;
	        }
	    }
	    System.out.println( finalResult);}
	    private static boolean check(String myString){
	        String temp = "";
	        for(int i = myString.length() - 1; i >= 0; i--){
	            temp += myString.charAt(i);
	        }
	        if(temp.equals(myString)){
	            return true;
	        }
	        else{
	            return false;
	        }
}
}
