package ooad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleAccessories implements Accessories {
	List<String> list = new ArrayList<String>(Arrays.asList("AirPods".toLowerCase(), "Beats Headphones".toLowerCase()));
	
	public AppleAccessories(String acc) {
		if(list.contains(acc.toLowerCase())) {
			System.out.println("Order placed is Apple product "+acc);
		}		
	}

}
