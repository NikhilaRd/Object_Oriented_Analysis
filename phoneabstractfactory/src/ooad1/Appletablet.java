package ooad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appletablet implements Tablet {
	List<String> list = new ArrayList<String>(Arrays.asList("iPad Pro".toLowerCase(), 
			"iPad Air 2".toLowerCase(), "iPad mini 4".toLowerCase()));
	
	public Appletablet(String tab) {
		if(list.contains(tab.toLowerCase())) {
			System.out.println("Order placed is Apple product "+tab);
		}		
	}

}
