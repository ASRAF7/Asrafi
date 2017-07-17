import java.util.*;
public class Hunterlast {
public static void main(String[] args) {
String input = "hello world";
List<String> words = Arrays.asList(input.split(" "));
Collections.reverse(words);
String result = "";
for(String word : words) {
    if(!result.isEmpty()) {
        result += " ";
    }
    result += word;
}
System.out.println(result);

	}
}
