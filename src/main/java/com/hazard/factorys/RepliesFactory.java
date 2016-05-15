package com.hazard.factorys;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazard.desk_ticket.Entry;
import com.hazard.replies.RepliesFromTicket;
import com.hazard.formatter.DateFormatter;

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
        List<com.hazard.replies.Entry> replies = repliesFromTicket.getEmbedded().getEntries();
        for (com.hazard.replies.Entry reply: replies) {
            String convertedDate = DateFormatter.convertDate(reply.getCreatedAt());
            reply.setCreatedAt(convertedDate);
        }
        return replies;

    }

    }

