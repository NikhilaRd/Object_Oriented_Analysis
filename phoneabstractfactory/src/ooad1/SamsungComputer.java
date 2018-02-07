package ooad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamsungComputer implements Computer {
	List<String> list = new ArrayList<String>(Arrays.asList("Notebook".toLowerCase()));
	public SamsungComputer(String com) {
		if(list.contains(com.toLowerCase())) {
			
		System.out.println("Order placed is samsung product "+com);
		}
	}
}


