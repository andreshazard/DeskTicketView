package com.hazard.todays_new_ticket_view;

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
public class TodaysNewTicketsController {

    @RequestMapping(value = "/todaysnewtickets", method = RequestMethod.GET)
    public String showTodaysTickets(ModelMap model) throws IOException {
        TodaysTicketFactory todaysTicketFactory = new TodaysTicketFactory();
        DeskTicket todaysTickets = todaysTicketFactory.getTodaysNewTickets();
        List<com.hazard.desk_ticket.Entry> entry = todaysTickets.getEmbedded().getEntries();
        model.clear();
        model.put("todaysNewTickets", entry);
        return "todays_open";
    }
}
