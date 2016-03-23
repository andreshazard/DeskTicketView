package com.hazard.factorys;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazard.desk_ticket.Entry;
import com.hazard.engineer.EngineerAssigned;

import java.io.IOException;
import java.io.InputStream;

/**
 * Factory class to create a Engineer object
 */
public class EngineerAssignedFactory extends AbstractFactory {


    public EngineerAssignedFactory(Entry ticket) {
        super(ticket);
    }

    public EngineerAssigned getEngineerAssigned() throws IOException {
        InputStreamFactory inputStreamFactory = new InputStreamFactory(ticket.getLinks().getAssignedUser().getHref(), ticket);
        InputStream inputStream = inputStreamFactory.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        EngineerAssigned engineerAssigned;
        engineerAssigned = mapper.readValue(inputStream, EngineerAssigned.class);
        return engineerAssigned;
    }
}
