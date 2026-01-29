package application.usecase;

import domain.Invoice;

public class ApprovedInvoiceProcessorUseCase extends ProcessInvoiceTemplateUseCase {

	@Override
	protected boolean shouldProcess(
			final Invoice invoice) {
		return invoice.isApproved();
	}

	@Override
	protected void processInvoice(
			final Invoice invoice) {
		
	}

}
