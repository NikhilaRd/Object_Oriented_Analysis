package ooad1;

public abstract class Order {
	 String name;
	 Tablet tablet;
	 Watch watch;
	 Computer computer;
	 Accessories accessories;
	 
	 abstract void selectPhone(String s1, String s2, String s3, String s4);
	 void shipping() {
	 System.out.println("shipping is done");
	 }
	 void payment() {
	 System.out.println("Payment is done");
	 }
	 void finish() {
	 System.out.println("Order is placed Successfully");
	 }
	 void setName(String name) {
	 this.name = name;
	 }
	 String getName() {
	 return name;
	 }
	 
	}