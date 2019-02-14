package character.part02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "mike", "tom");
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
		
		System.out.println(names);
		
		// lambda±í´ïÊ½
		Collections.sort(names, (String a, String b)->{ 
			return a.compareTo(b);
		});
		Collections.sort(names, (String a, String b)->a.compareTo(b));
		Collections.sort(names, (a, b)->a.compareTo(b));
		System.out.println(names);
		
	}
	
}
