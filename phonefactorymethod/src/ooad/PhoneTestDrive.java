package ooad;


public class PhoneTestDrive {
	public static void main(String[] args) {
		 PhoneStore applestore = new Applephonestore();
		 PhoneStore Samsungstore = new Samsungphonestore();
		 Phone phone = applestore.orderPhone("Iphone7plus");
		 System.out.println("John ordered a " + phone.getName() + "\n");
		 phone = Samsungstore.orderPhone("Galaxynote7");
		 System.out.println("Zack ordered a " + phone.getName() + "\n");
		 }

}