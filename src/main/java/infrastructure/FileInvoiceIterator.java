package infrastructure;

import application.port.InvoiceIterator;
import domain.Invoice;

public class FileInvoiceIterator implements InvoiceIterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Invoice next() {
		return null;
	}

}
