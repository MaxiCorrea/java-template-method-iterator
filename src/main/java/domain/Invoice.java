package domain;

import java.math.BigDecimal;

public class Invoice {

	private final String id;
	private final BigDecimal amount;
	private final boolean approved;
	
	public Invoice(
			final String id,
			final BigDecimal amount,
			final boolean approved){
		this.id = id;
		this.amount = amount;
		this.approved = approved;
	}
	
	public String getId() {
		return id;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public boolean isApproved() {
		return approved;
	}
	
}
