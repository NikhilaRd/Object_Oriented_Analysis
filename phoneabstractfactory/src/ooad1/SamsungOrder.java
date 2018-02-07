package ooad1;

public class SamsungOrder extends Order {
	 Orderfactory orderfactory;
	 public SamsungOrder(Orderfactory orderfactory) {
	 this.orderfactory = orderfactory;
	 }
	 void selectPhone(String s1, String s2, String s3, String s4) {
		 System.out.println("selecting " + name);
		 tablet = orderfactory.selectTablet(s1);
		 watch = orderfactory.selectWatch(s2);
		 computer = orderfactory.selectComputer(s3);
		 accessories = orderfactory.selectAccessories(s4);
	 }
	}
