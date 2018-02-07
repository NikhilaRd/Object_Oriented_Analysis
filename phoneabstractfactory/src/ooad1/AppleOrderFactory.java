package ooad1;

public class AppleOrderFactory implements Orderfactory {
	public Tablet selectTablet(String tab) {
	 	return new Appletablet(tab);
	 }
	 public Watch selectWatch(String wat) {
		return new Applewatch(wat);
	 }
	 public Computer selectComputer(String com) {
		return new AppleComputer(com);
	 }
	 public Accessories selectAccessories(String acc) {
		return new AppleAccessories(acc);
	 }
}
