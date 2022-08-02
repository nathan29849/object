package nathan.ch2.discount.policy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nathan.ch2.Money;
import nathan.ch2.Screening;
import nathan.ch2.discount.condition.DiscountCondition;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{

	private List<DiscountCondition> conditions = new ArrayList<>();

	protected DefaultDiscountPolicy(DiscountCondition... conditions) {
		this.conditions = Arrays.asList(conditions);
	}

	public Money calculateDiscountAmount(Screening screening) {
		for (DiscountCondition each : conditions) {
			if (each.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}
		return Money.ZERO;
	}

	protected abstract Money getDiscountAmount(Screening screening);
}
