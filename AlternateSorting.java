import java.util.*;
public class AlternateSorting {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList(Arrays.asList(1,2,3,7,5,6,4,8));
	Collections.sort(list,Collections.reverseOrder());
	int i=1;
	while(i<list.size()){
		int val = list.remove(list.size()-1);
		list.add(i, val);
		i=i+2;
	}
	System.out.println(list);


	}

}
