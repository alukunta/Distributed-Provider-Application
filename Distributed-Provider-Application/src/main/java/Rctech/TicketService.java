package Rctech;

import java.util.Collection;

public interface TicketService {
	
	public Ticket bookTicket(Passenger p);
	
	public Collection<Ticket> getAllTickets();

}
