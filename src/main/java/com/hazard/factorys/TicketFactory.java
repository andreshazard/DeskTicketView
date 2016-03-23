package com.hazard.factorys;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazard.desk_ticket.DeskTicket;
import com.hazard.desk_ticket.Entry;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Factory class to create a Ticket object
 */
@Service
public class TicketFactory {

    private String ticketId;

    public TicketFactory(String ticketId) {
        this.ticketId = ticketId;
    }

    public TicketFactory() {
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public final Entry getDeskTicket() throws IOException {

        String apiUrl = "https://servicerocket.desk.com/api/v2/cases/search?q=caseid:" + this.ticketId;
        InputStreamFactory inputStreamFactory = new InputStreamFactory(apiUrl);
        InputStream inputStream = inputStreamFactory.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        DeskTicket deskTicket;
        deskTicket = mapper.readValue(inputStream, DeskTicket.class);
        List<Entry> info;
        info = deskTicket.getEmbedded().getEntries();
        Entry returningTicket = new Entry();
        for (Entry ticket : info) {
            returningTicket = ticket;
            break;
        }
        return returningTicket;


    }
}
