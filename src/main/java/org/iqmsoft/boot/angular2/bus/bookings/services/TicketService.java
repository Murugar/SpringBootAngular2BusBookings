package org.iqmsoft.boot.angular2.bus.bookings.services;

import java.util.List;

import org.iqmsoft.boot.angular2.bus.bookings.domain.Ticket;

public interface TicketService {
    Ticket bookTicket(Long connectionId, String username);
    void cancelBookTicket(Long ticketId, String username);
    List<Ticket> getAllTicketsOfUser(String username);
    void deleteTicket(Long id);
    List<Ticket> getAllTickets();
    Ticket getTicket(Long id);
}
