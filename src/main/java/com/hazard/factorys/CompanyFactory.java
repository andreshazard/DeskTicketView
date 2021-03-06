package com.hazard.factorys;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazard.desk_ticket.DeskTicket;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

/**
 * Factory class to get ticets from a company
 */
@Service
public class CompanyFactory {
    private String company;

    public CompanyFactory() {
        this.company = "";
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public DeskTicket getDeskTickets() throws IOException {

        //Getting the first word of the company name
        String[] arr= this.company.split(" ", 2);
        String apiUrl = "https://servicerocket.desk.com/api/v2/cases/search?q=company:%22" + arr[0] +
                "%22%20group:Learndot%20status:open,pending,new";
        InputStreamFactory inputStreamFactory = new InputStreamFactory(apiUrl);
        InputStream inputStream = inputStreamFactory.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        DeskTicket deskTicket;
        deskTicket = mapper.readValue(inputStream, DeskTicket.class);
        return deskTicket;
    }
}
