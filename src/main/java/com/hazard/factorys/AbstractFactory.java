package com.hazard.factorys;

import com.hazard.desk_ticket.Entry;

/**
 * Abstract class for all factories that use a an Desk Ticket Entry
 */
public abstract class AbstractFactory {

    Entry ticket;

    public AbstractFactory(Entry ticket) {
        this.ticket = ticket;
    }

    public void setTicket(Entry ticket) {
        this.ticket = ticket;
    }


}
