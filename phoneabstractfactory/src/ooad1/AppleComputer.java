package ooad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleComputer implements Computer {
	List<String> list = new ArrayList<String>(Arrays.asList("MacBook".toLowerCase()));
	public AppleComputer(String com) {
		if(list.contains(com.toLowerCase())) {
			System.out.println("Order placed is "+com);
			
		}		
	}
}

