package application.usecase;

import domain.Invoice;

public class AuditInvoiceProcessorUseCase extends ProcessInvoiceTemplateUseCase {

	@Override
	protected boolean shouldProcess(
			final Invoice invoice) {
		return true;
	}

	@Override
	protected void processInvoice(
			final Invoice invoice) {
		
	}

}
