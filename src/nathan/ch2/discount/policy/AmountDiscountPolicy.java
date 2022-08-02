package nathan.ch2.discount.policy;

import nathan.ch2.Money;
import nathan.ch2.Screening;
import nathan.ch2.discount.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

	private Money discountAmount;

	public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
		super(conditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
}
