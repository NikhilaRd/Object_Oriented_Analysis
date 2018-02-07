package ooad1;

public class AppleOrder extends Order {
	 Orderfactory orderfactory;
	 public AppleOrder(Orderfactory orderfactory) {
		 this.orderfactory = orderfactory;
	 }
	 void selectPhone(String tab, String watch, String computer, String acc) {
		 //System.out.println("selecting " + name);
		 this.tablet = orderfactory.selectTablet(tab);
		 this.watch = orderfactory.selectWatch(watch);
		 this.computer = orderfactory.selectComputer(computer);
		 this.accessories = orderfactory.selectAccessories(acc);
	 }
	}