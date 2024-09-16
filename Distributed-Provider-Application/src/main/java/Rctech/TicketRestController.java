package Rctech;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController {
	@Autowired
	private TicketService service;
	@PostMapping("/ticket")
	public Ticket bookTicket(@RequestBody Passenger p) {
		Ticket t = service.bookTicket(p);
		return t;
	}
	
	@GetMapping("/tickets")
	public Collection<Ticket> getAllTickets(){
		Collection<Ticket> allTickets = service.getAllTickets();
		return allTickets;
	}
	


}
