package ooad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamsungAccessories implements Accessories {
	List<String> list = new ArrayList<String>(Arrays.asList("Keyboard Cover".toLowerCase(),
			"Adapter".toLowerCase()));
	public SamsungAccessories(String acc) {
		if(list.contains(acc.toLowerCase())) {
		System.out.println("Order placed is samsung product "+acc);
		}
	}	
}
