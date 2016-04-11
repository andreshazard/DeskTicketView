package com.hazard.ticket.view;

import com.hazard.customer.CustomerInfo;
import com.hazard.desk_ticket.Entry;
import com.hazard.engineer.EngineerAssigned;
import com.hazard.factorys.*;
import com.hazard.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

/**
 * Created by andreshazard on 3/19/16.
 */
@Controller
public class TicketController {

    @Autowired
    TicketFactory ticketFactory;


    @RequestMapping(value = "/view_ticket", method =  {RequestMethod.GET, RequestMethod.POST})
    public String viewTicketRequest(@RequestParam String id, ModelMap model) throws IOException {

        try {
            // Get main ticket info from Desk
            ticketFactory.setTicketId(id);
            Entry deskTicket = ticketFactory.getDeskTicket();

            // Get the customer's info from the Desk ticket
            CustomerInfoFactory customerInfoFactory = new CustomerInfoFactory(deskTicket);
            CustomerInfo customerInfo = customerInfoFactory.getCustomerInfo();

            //Get the engineer's info from the Desk ticket
            EngineerAssignedFactory engineerAssignedFactory = new EngineerAssignedFactory(deskTicket);
            EngineerAssigned engineerAssigned = engineerAssignedFactory.getEngineerAssigned();

            //Get the first message from the Desk ticket
            MessageFactory messageFactory = new MessageFactory(deskTicket);
            Message message = messageFactory.getMessage();

            //Get replies from the ticket
            RepliesFactory repliesFactory = new RepliesFactory(deskTicket);
            List<com.hazard.replies.Entry> repliesFromTicket = repliesFactory.getRepliesFromTicket();
            model.clear();
            model.put("deskTicket", deskTicket);
            model.put("customerInfo", customerInfo);
            model.put("engineerAssigned", engineerAssigned);
            model.put("message", message);
            model.put("replies", repliesFromTicket);

            return "view_ticket";
        } catch (IOException e) {
            return "home_error" + e;
        } catch (NullPointerException e) {
            return "home_error" + e;
        }


    }

}





