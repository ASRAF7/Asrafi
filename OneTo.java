import java.util.*;
@SuppressWarnings("unused")
public class OneTo {
public static void Fshow(int n) { 
	 if(n <= 100) 
	 {
	 System.out.println(n); 
	 Fshow(n+1);   }
	}
public static void main(String args[]) {
	 Fshow(1); 
	}
}
