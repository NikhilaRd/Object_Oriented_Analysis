package ooad;



public abstract class PhoneStore {
	public Phone orderPhone(String type) {
		 Phone phone;
		 phone = selectModel(type);
		 phone.inputMailingAddress();
		 phone.makePayment();
		 phone.finish();
		 return phone;
		 }
	protected abstract Phone selectModel(String type);

}
