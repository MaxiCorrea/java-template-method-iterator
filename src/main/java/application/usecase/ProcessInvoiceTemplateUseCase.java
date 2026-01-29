package application.usecase;

import java.math.BigDecimal;

import application.port.InvoiceIterator;
import domain.Invoice;
import domain.ProcessingResult;

public abstract class ProcessInvoiceTemplateUseCase {

	public final ProcessingResult process(
			final InvoiceIterator iterator) {
		int processed = 0;
		BigDecimal totalAmount = BigDecimal.ZERO;
		beforeProcessing();
		while(iterator.hasNext()) {
			Invoice invoice = iterator.next();
			if(shouldProcess(invoice)) {
				processInvoice(invoice);
				processed++;
				totalAmount = totalAmount.add(invoice.getAmount());
			}
		}
		afterProcessing();
		return new ProcessingResult(processed, totalAmount);
	}

	protected void afterProcessing() {}

	protected abstract boolean shouldProcess(Invoice invoice);

	protected abstract void processInvoice(Invoice invoice);
	
	protected void beforeProcessing() {}
	
}
