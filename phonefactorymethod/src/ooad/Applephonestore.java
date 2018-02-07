package ooad;


public class Applephonestore extends PhoneStore {
	protected Phone selectModel(String item) {
		 if (item.equals("Iphone8")) {
		 return new Iphone8model();
		 } else if (item.equals("Iphone7plus")) {
		 return new Iphone7plusmodel();
		 } else if (item.equals("IphoneX")) {
		 return new IphoneXmodel();
		 } 
		 else return null;
		 }
	

}