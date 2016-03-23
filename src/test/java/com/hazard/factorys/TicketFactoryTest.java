package com.hazard.factorys;

import com.hazard.desk_ticket.Entry;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by andreshazard on 3/22/16.
 */
public class TicketFactoryTest {

    TicketFactory ticketFactory = new TicketFactory();

    @Test
    public void testGetDeskTicket_ValidTicketID() throws Exception {
        ticketFactory.setTicketId("16828");
        assertThat(ticketFactory.getDeskTicket(), instanceOf(Entry.class));
    }

    @Test
    public void testGetDeskTicket_ValidTicketID2() throws Exception {
        ticketFactory.setTicketId("16828");
        assertFalse(ticketFactory.getDeskTicket().getId() == null);
    }

    @Test
    public void testGetDeskTicket_InvalidTicketID() throws Exception {
        ticketFactory.setTicketId("1");
        assertTrue(ticketFactory.getDeskTicket().getId() == null);
    }

    @Test
    public void testGetDeskTicket_NullTicketId() throws Exception {
        ticketFactory.getDeskTicket();
        assertTrue(ticketFactory.getDeskTicket().getId() == null);
    }

    @Test(timeout = 30000)
    public void testGetDeskTicket_Performacen() throws Exception {
        ticketFactory.setTicketId("16828");
        Entry entry = ticketFactory.getDeskTicket();
    }

}