package com.hazard.todays_close_ticket_view;

import com.hazard.desk_ticket.DeskTicket;
import com.hazard.desk_ticket.Entry;
import com.hazard.factorys.TodaysTicketFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;

/**
 * Controller for close tickets of af the day
 */

@Controller
public class TodaysCloseTicketsController {

    @RequestMapping(value = "/todaysclosetickets", method = RequestMethod.GET)
    public String showTodaysTickets(ModelMap model) throws IOException {
        TodaysTicketFactory todaysTicketFactory = new TodaysTicketFactory();
        DeskTicket todaysTickets = todaysTicketFactory.getTodaysCloseTickets();
        List<Entry> entry = todaysTickets.getEmbedded().getEntries();
        model.clear();
        model.put("todaysCloseTickets", entry);
        return "todays_close";
    }
}
