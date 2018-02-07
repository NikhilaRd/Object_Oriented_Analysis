package ooad;


public abstract class Phone {
		 String name;
		 String stname;
		 String cname;
		 String sname;
		 String zip;
		 String cardno;
		
		 void inputMailingAddress() {
	     System.out.println("The Order Placed for " +name);
	     System.out.println("Customer details are : ");
		 System.out.println("Street Name :" +stname);
		 System.out.println("City :" +cname);
		 System.out.println("State :" +sname);
		 System.out.println("Zip Code :" +zip);
		 }

		 void makePayment() {
		 System.out.println("Enter Credit Card number " +cardno);
		 }

		 void finish() {
		 System.out.println("Your Order is placed Successfully");
		 }
		 public String getName() {
		 return name;
		 }
		 public String getStname() {
			 return stname;
		 }
		 public String getCname() {
			 return cname;
		 }
		 public String getSname() {
			 return sname;
		 }
		 public String getZip() {
			 return zip;
		 }
		 public String getCardno() {
			 return cardno;
		 }
		}