package ooad;

public class Samsungphonestore extends PhoneStore {
	protected Phone selectModel(String item) {
		 if (item.equals("Galaxynote7")) {
		 return new Galaxynote7model();
		 } else if (item.equals("GalaxyS7edge")) {
		 return new GalaxyS7edgemodel();
		 } 
		 else return null;
		 }

}
