package interfaces;

public interface PaymentService {
	
	Double fees (double amount); 
	Double interest(Double amount, Integer months);

}
