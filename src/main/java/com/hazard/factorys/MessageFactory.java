package com.hazard.factorys;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazard.desk_ticket.Entry;
import com.hazard.message.Message;

import java.io.IOException;
import java.io.InputStream;

/**
 * Factory class to create a message object
 */
public class MessageFactory extends AbstractFactory {

    public MessageFactory(Entry ticket) {
        super(ticket);
    }

    public final Message getMessage() throws IOException {
        InputStreamFactory inputStreamFactory = new InputStreamFactory(ticket.getLinks().getMessage().getHref(), ticket);
        InputStream inputStream = inputStreamFactory.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        Message message;
        message = mapper.readValue(inputStream, Message.class);
        return message;
    }
}
