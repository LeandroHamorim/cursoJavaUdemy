package interfaces;

public class PaypalService implements PaymentService {

	@Override
	public Double fees(double amount) {
		return amount + (amount * 0.02);
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount + ((amount * 0.01) * months);
	}

}
