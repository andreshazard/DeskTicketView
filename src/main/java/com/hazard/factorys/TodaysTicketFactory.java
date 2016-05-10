package com.hazard.factorys;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazard.todaysTickets.TodaysTickets;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * Factory class to get today's tickets
 */
public class TodaysTicketFactory {

    private String apiCall;
    private InputStreamFactory inputStreamFactory;

    public TodaysTicketFactory() {
        this.apiCall = "https://servicerocket.desk.com/api/v2/cases/search?q=created:today%20group:Learndot%20status:open,pending,new";
        inputStreamFactory = new InputStreamFactory(apiCall);
    }

    public TodaysTickets getTodaysTickets() throws IOException {
        InputStream inputStream = inputStreamFactory.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        TodaysTickets todaysTickets;
        todaysTickets = mapper.readValue(inputStream, TodaysTickets.class);
        return todaysTickets;



    }
}
