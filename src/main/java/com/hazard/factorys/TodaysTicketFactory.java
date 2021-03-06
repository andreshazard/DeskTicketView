package com.hazard.factorys;
import com.hazard.customer.CustomerInfo;
import com.hazard.desk_ticket.DeskTicket;
import com.hazard.desk_ticket.Entry;
import com.hazard.engineer.EngineerAssigned;

import java.io.IOException;

/**
 * Factory class to get today's tickets
 */
public class TodaysTicketFactory {

    private TicketFactory ticketFactory;
    private CustomerInfoFactory customerInfoFactory;
    private CustomerInfo customerInfo;
    private EngineerAssignedFactory engineerAssignedFactory;
    private EngineerAssigned engineerAssigned;

    public TodaysTicketFactory() {
        ticketFactory = new TicketFactory();
    }

    public DeskTicket getTodaysNewTickets() throws IOException {
        DeskTicket todaysTickets;
        todaysTickets = ticketFactory.getTodaysTickets("https://servicerocket.desk.com/api/v2/cases/search?q=" +
                "created:today%20group:Learndot%20status:open,pending,new");
        getCompanyOfTickets(todaysTickets);
        getEngineerAssignOfTickets(todaysTickets);

        return todaysTickets;
    }

    public DeskTicket getTodaysCloseTickets() throws IOException {
        DeskTicket todaysTickets;
        todaysTickets = ticketFactory.getTodaysTickets("https://servicerocket.desk.com/api/v2/cases/search?q=" +
                "group:Learndot%20status:resolved%20updated:today%20labels:%22%21Spam%22");
        getCompanyOfTickets(todaysTickets);
        getEngineerAssignOfTickets(todaysTickets);

        return todaysTickets;
    }

    private void getCompanyOfTickets(DeskTicket todaysTickets) {
        for (Entry ticket : todaysTickets.getEmbedded().getEntries()) {
            try {
                customerInfoFactory = new CustomerInfoFactory(ticket);
                customerInfo = customerInfoFactory.getCustomerInfo();
                ticket.setCompany(customerInfo.getCompanyName());
            } catch (Exception e) {
                ticket.setCompany(null);
            }
        }
        return;
    }

    private void getEngineerAssignOfTickets(DeskTicket todaysTickets) {
        for (Entry ticket : todaysTickets.getEmbedded().getEntries()) {
            try {
                engineerAssignedFactory = new EngineerAssignedFactory(ticket);
                engineerAssigned = engineerAssignedFactory.getEngineerAssigned();
                ticket.setEngineerAssign(engineerAssigned.getEmail());
            }catch (Exception e) {
                ticket.setEngineerAssign(null);
            }
        }
        return;
    }
}
