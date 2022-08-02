package nathan.ch2.discount.policy;

import nathan.ch2.Money;
import nathan.ch2.Screening;

public interface DiscountPolicy {

	Money calculateDiscountAmount(Screening screening);

}
