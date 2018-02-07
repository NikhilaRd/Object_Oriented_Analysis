package ooad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Applewatch implements Watch {
	List<String> list = new ArrayList<String>(Arrays.asList("Apple Watch Series 2".toLowerCase(), 
			"Apple Watch Nike+".toLowerCase()));
	public Applewatch(String wat) {
		if(list.contains(wat.toLowerCase())) {
			System.out.println("Order placed is Apple product "+wat);
		}
	}
}
