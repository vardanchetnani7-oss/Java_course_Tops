package assessment_section_B;

public class PaymentSystem {
public static void main(String[] args) {
	User premiumUser  = new User("Vardan","vardanchetnani@oksbi",500);
	System.out.println("user:"+premiumUser.getName());
	System.out.println("masked upi id :"+premiumUser.getMaskedUpiId());
	System.out.println("initial balance "+premiumUser.getBalance());
	
	PaymentMethod wallet = new WalletBalance();
	
	try {
		wallet.processPayment(200, premiumUser);
		System.out.println("new balance: "+premiumUser.getBalance());
	}
	catch(InsufficientBalanceException e){
		System.err.println("transaction error"+e.getMessage());
	}
}
}
