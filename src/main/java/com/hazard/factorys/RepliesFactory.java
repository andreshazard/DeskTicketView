package com.hazard.factorys;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazard.desk_ticket.Entry;
import com.hazard.replies.RepliesFromTicket;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by andreshazard on 3/21/16.
 */
public class RepliesFactory extends AbstractFactory {

    public RepliesFactory(Entry ticket) {
        super(ticket);
    }

    public List<com.hazard.replies.Entry> getRepliesFromTicket() throws IOException {
        InputStreamFactory inputStreamFactory = new InputStreamFactory(ticket.getLinks().getReplies().getHref(), ticket);
        InputStream inputStream = inputStreamFactory.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        RepliesFromTicket repliesFromTicket;
        repliesFromTicket = mapper.readValue(inputStream, RepliesFromTicket.class);
        return repliesFromTicket.getEmbedded().getEntries();

    }
}
