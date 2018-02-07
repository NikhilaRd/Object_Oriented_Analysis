package ooad1;

public class SamsungOrderStore extends OrderStore {

	@Override
	public Order createOrder(String tab,String watch, String computer, String acc) {
		SamsungOrderFactory samsungOrderFactory = new SamsungOrderFactory();
		samsungOrderFactory.selectTablet(tab);
		samsungOrderFactory.selectWatch(watch);
		samsungOrderFactory.selectComputer(computer);
		samsungOrderFactory.selectAccessories(acc);
		Order order = new SamsungOrder(samsungOrderFactory);
		return order;
	}

}
