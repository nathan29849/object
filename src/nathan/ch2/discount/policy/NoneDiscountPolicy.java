package nathan.ch2.discount.policy;

import nathan.ch2.Money;
import nathan.ch2.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

	@Override
	public Money calculateDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}
