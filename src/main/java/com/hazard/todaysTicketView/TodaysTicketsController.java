package com.hazard.todaysTicketView;

import com.hazard.factorys.TodaysTicketFactory;
import com.hazard.todaysTickets.Entry;
import com.hazard.todaysTickets.TodaysTickets;
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
        TodaysTickets todaysTickets = todaysTicketFactory.getTodaysTickets();
        List<Entry> entry = todaysTickets.getEmbedded().getEntries();
        model.clear();
        model.put("todaysTickets", entry);
        return "todays";
    }
}
