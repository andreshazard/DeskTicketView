package com.hazard.company.view;

import com.hazard.desk_ticket.DeskTicket;
import com.hazard.desk_ticket.Entry;
import com.hazard.factorys.CompanyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Created by andreshazard on 3/20/16.
 */
@Controller
public class CompanyController {

    @Autowired
    private CompanyFactory companyFactory;

    private DeskTicket deskTicketsObject;

    @RequestMapping(value = "/view_customer", method = {RequestMethod.POST, RequestMethod.GET})
    public String viewCustomerRequest(@RequestParam String company, ModelMap model) throws IOException {
        //Get all tickets from customer on DeskTicket object
        companyFactory.setCompany(company);
        deskTicketsObject = companyFactory.getDeskTickets();
        int numberOfTickets = deskTicketsObject.getTotalEntries();
        List<Entry> deskTickets = deskTicketsObject.getEmbedded().getEntries();
        Collections.reverse(deskTickets); //to get tickets on order
        model.put("deskTickets", deskTickets);
        model.put("company", company);
        model.put("numberOfTickets", numberOfTickets);
        return "view_customer";
    }
}
