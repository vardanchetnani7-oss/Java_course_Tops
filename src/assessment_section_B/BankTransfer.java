package assessment_section_B;

public class BankTransfer implements PaymentMethod{

	@Override
	public void processPayment(double amount, User user) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		if(amount>user.getBalance()) {
			throw new InsufficientBalanceException("BANK TRANSFER FAILED : INSUFFICIENT BALANCE");
		}
		user.setBalance(user.getBalance()-amount);
		System.out.println("sucessfully paid "+amount+ "via bank transfer ");
	}

}
