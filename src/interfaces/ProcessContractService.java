package interfaces;

import java.util.Calendar;
import java.util.Date;

public class ProcessContractService {
	
	private Contract contract;
	private Integer months;
	private PaymentService paymentService;
	
	public ProcessContractService(Contract contract, Integer months, PaymentService paymentService) {
		this.contract = contract;
		this.months = months;
		this.paymentService = paymentService;
	}
	
	
	public void ProcessInstallments(Contract x, int months) {
		Calendar calendar = Calendar.getInstance();
		for(int i = 1; i <= months; i++) {
			
			
		}
		
	}
	
	
	
	

}
