package com.hazard.todaysTicketView;

import com.hazard.desk_ticket.DeskTicket;
import com.hazard.factorys.TodaysTicketFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;

/**
 * Controller of the view today's tickets page
 */

@Controller
public class TodaysTicketsController {

    @RequestMapping(value = "/todays", method = RequestMethod.GET)
    public String showTodaysTickets(ModelMap model) throws IOException {
        TodaysTicketFactory todaysTicketFactory = new TodaysTicketFactory();
        DeskTicket todaysTickets = todaysTicketFactory.getTodaysTickets();
        List<com.hazard.desk_ticket.Entry> entry = todaysTickets.getEmbedded().getEntries();
        model.clear();
        model.put("todaysTickets", entry);
        return "todays";
    }
}
