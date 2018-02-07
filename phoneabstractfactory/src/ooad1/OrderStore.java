package ooad1;

public abstract class OrderStore {
	public Order order(String tab,String watch, String computer, String acc) {
		Order order = createOrder(tab,watch,computer,acc);
		
		return order;
	}
	public abstract Order createOrder(String tab,String watch, String computer, String acc);
}
