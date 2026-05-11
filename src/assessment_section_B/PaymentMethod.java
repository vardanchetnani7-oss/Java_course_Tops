package assessment_section_B;

public interface PaymentMethod {
	void processPayment(double amount , User user) throws InsufficientBalanceException ;
}
