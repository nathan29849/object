package nathan.ch2.discount.policy;

import nathan.ch2.Money;
import nathan.ch2.Screening;
import nathan.ch2.discount.condition.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {

	private double percent;

	public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
		super(conditions);
		this.percent = percent;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
