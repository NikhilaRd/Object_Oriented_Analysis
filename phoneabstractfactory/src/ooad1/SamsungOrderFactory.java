package ooad1;

public class SamsungOrderFactory implements Orderfactory {
	public Tablet selectTablet(String tab) {
		return new SamsungTablet(tab);
	}
	public Watch selectWatch(String wat) {
		return new SamsungWatch(wat);
	}
	public Computer selectComputer(String com) {
		return new SamsungComputer(com);
	}
	public Accessories selectAccessories(String acc) {
		return new SamsungAccessories(acc);
	}
}