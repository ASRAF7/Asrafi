import java.util.*;
public class CamelCase {
@SuppressWarnings("resource")
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String input = sc.nextLine();
    String result = "";
    char char1 = input.charAt(0);
    result = result + Character.toUpperCase(char1);
    for (int i = 1; i < input.length(); i++) {
        char currentChar = input.charAt(i);
        char previousChar = input.charAt(i - 1);
        if (previousChar == ' ') {
            result = result + Character.toUpperCase(currentChar);
        } else {
            result = result + currentChar;
        }
    }
    System.out.println(result);
if(input.equals(result)) {
	System.out.println("the sentance is not a camel case");
}else {
	System.out.println("the sentance is camel case");
}
	}

}
