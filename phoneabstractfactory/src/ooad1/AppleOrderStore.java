package ooad1;

public class AppleOrderStore extends OrderStore {

	@Override
	public Order createOrder(String tab,String watch, String computer, String acc) {
		AppleOrderFactory appleOrderFactory = new AppleOrderFactory();
		appleOrderFactory.selectTablet(tab);
		appleOrderFactory.selectWatch(watch);
		appleOrderFactory.selectComputer(computer);
		appleOrderFactory.selectAccessories(acc);
		Order order = new AppleOrder(appleOrderFactory);
		return order;
	}

}
