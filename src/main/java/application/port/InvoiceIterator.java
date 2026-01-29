package application.port;

import domain.Invoice;

public interface InvoiceIterator {

	boolean hasNext();
	
	Invoice next();
	
}
