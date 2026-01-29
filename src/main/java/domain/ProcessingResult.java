package domain;

import java.math.BigDecimal;
import java.util.Objects;

public class ProcessingResult {

	private final int processed;
	private final BigDecimal totalAmount;
	
	public ProcessingResult(
			final int processed, 
			final BigDecimal totalAmount) {
		this.processed = processed;
		this.totalAmount = totalAmount;
	}

	public int getProcessed() {
		return processed;
	}
	
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(processed, totalAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessingResult other = (ProcessingResult) obj;
		return processed == other.processed && Objects.equals(totalAmount, other.totalAmount);
	}

}
