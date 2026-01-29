package application.usecase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import application.port.InvoiceIterator;
import domain.Invoice;
import domain.ProcessingResult;

class ApprovedInvoiceProcessorUseCaseTest {

	InvoiceIterator iterator = new InvoiceIterator() {
		
		private final Iterator<Invoice> data = List.of(
				new Invoice("1", BigDecimal.TEN, true),
				new Invoice("2", BigDecimal.TEN, false),
				new Invoice("2", BigDecimal.TWO, true)
				).iterator();
		
		@Override
		public Invoice next() {
			return data.next();
		}
		
		@Override
		public boolean hasNext() {
			return data.hasNext();
		}
	};
	
	@Test
	void shouldProcessOnlyApprovedInvoicesAndSumAmounts() {
		ApprovedInvoiceProcessorUseCase usecase = new ApprovedInvoiceProcessorUseCase();
		ProcessingResult result = usecase.process(iterator);
		assertEquals(new ProcessingResult(2, new BigDecimal("12")), result);
	}

}
