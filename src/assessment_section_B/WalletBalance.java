package assessment_section_B;

public class WalletBalance implements PaymentMethod  {

	@Override
	public void processPayment(double amount, User user) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		if(amount>user.getBalance()) {
			throw new InsufficientBalanceException("wallet payment failed");
		}
		
		user.setBalance(user.getBalance() - amount);
		System.out.println("successfully paid "+amount+" via wallet ");
	}

}
