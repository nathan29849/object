package nathan.ch2.discount.condition;

import nathan.ch2.Screening;

public class SequenceCondition implements DiscountCondition{

	private int sequence;

	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(sequence);
	}
}
