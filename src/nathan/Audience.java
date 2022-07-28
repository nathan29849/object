package nathan;

public class Audience {

	private Bag bag;

	public Audience(Bag bag) {
		this.bag = bag;
	}

	public Bag getBag() {
		return bag;
	}

	public Long buy(Ticket ticket) {
		bag.setTicket(ticket);
		if (!bag.hasInvitation()) {
			bag.minusAmount(ticket.getFee());
			return ticket.getFee();
		}
		return 0L;
	}
}
