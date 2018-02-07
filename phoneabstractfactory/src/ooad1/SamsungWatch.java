package ooad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamsungWatch implements Watch {
	List<String> list = new ArrayList<String>(Arrays.asList("Gear S3".toLowerCase(), "Gear S2".toLowerCase()));
	public SamsungWatch(String wat) {
		if(list.contains(wat.toLowerCase())) {
			System.out.println("Order placed is samsung product "+wat);
			
		}
		
	}
}


