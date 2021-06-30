package interfaces;

public class ProcessContractService {
	
	private PaymentService paymentService;
	
	public ProcessContractService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void ProcessInstallments(Contract contract, int months) {
	
		Double installmentAmount = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			var installmentDate = contract.getDate().plusMonths(i);
			Double quota = installmentAmount + paymentService.fees(installmentAmount);
			Double finalQuota = quota + paymentService.interest(quota, i);
			var installment = new Installment(installmentDate, finalQuota);
			contract.addInstallment(installment);
		}
	}
}
