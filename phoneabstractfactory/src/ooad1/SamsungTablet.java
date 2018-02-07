package ooad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamsungTablet implements Tablet {
	List<String> list = new ArrayList<String>(Arrays.asList("Galaxy TabPro S".toLowerCase(), "Galaxy Tab S2".toLowerCase()));
	public SamsungTablet(String tab) {
		if(list.contains(tab.toLowerCase())) {
			System.out.println("Order placed is Samsung product "+tab);
			
		}	
	}
}
