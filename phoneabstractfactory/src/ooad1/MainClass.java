package ooad1;

public class MainClass {

	public static void main(String[] args) {
		OrderStore sOrder = new SamsungOrderStore();
		sOrder.createOrder("Galaxy Tab S2", "", "", "Keyboard Cover");
		OrderStore aOrder = new AppleOrderStore();
		aOrder.createOrder("iPad Pro", "", "", "Beats Headphones");
		
		

	}

}
