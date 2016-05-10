package com.hazard.factorys;
import com.hazard.desk_ticket.DeskTicket;

import java.io.IOException;

/**
 * Factory class to get today's tickets
 */
public class TodaysTicketFactory {

    private TicketFactory ticketFactory;

    public TodaysTicketFactory() {
        ticketFactory = new TicketFactory();
    }

    public DeskTicket getTodaysTickets() throws IOException {
        DeskTicket todaysTickets;
        todaysTickets = ticketFactory.getTodaysTickets();
        return todaysTickets;



    }
}
