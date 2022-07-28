package nathan;

public class TicketSeller {

	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public void sellTo(Audience audience) {
		Long fee = audience.buy(ticketOffice.getTicket());
		ticketOffice.plusAmount(fee);
//		ticketOffice.sellTicketTo(audience);
	}
}
