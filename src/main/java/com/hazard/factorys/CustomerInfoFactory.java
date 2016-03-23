package com.hazard.factorys;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazard.customer.CustomerInfo;
import com.hazard.desk_ticket.Entry;

import java.io.IOException;
import java.io.InputStream;

/**
 * Factory class to create a Customer object with the customer info
 * of a desk ticket
 */
public class CustomerInfoFactory extends AbstractFactory {

    public CustomerInfoFactory(Entry ticket) {
        super(ticket);
    }

    public  CustomerInfo getCustomerInfo() throws IOException {
            InputStreamFactory inputStreamFactory = new InputStreamFactory
                    (ticket.getLinks().getCustomer().getHref(), ticket);
            InputStream inputStream = inputStreamFactory.getInputStream();
            ObjectMapper mapper = new ObjectMapper();
            CustomerInfo customerInfo;
            customerInfo = mapper.readValue(inputStream, CustomerInfo.class);
            return customerInfo;

    }
}

