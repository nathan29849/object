package nathan.ch2.discount.condition;

import nathan.ch2.Screening;

public interface DiscountCondition {

	boolean isSatisfiedBy(Screening screening);
}
