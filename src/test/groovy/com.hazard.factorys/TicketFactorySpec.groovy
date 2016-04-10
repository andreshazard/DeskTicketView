import com.hazard.desk_ticket.Entry
import com.hazard.factorys.TicketFactory
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Shared
/**
 *
 * Created by andreshazard on 4/9/16.
 */

class TicketFactorySpec extends spock.lang.Specification {

    @Autowired
    @Shared
    TicketFactory ticketFactory;

    def setupSpec() {
        ticketFactory = new TicketFactory();
    }

    def "Test ticket factory with a valid ID"() {

        when: "a valid ticket number is provided"
        ticketFactory.setTicketId("16828");


        then: "a non null ticket object is returned"
        ticketFactory.getDeskTicket()

        and: "return type is a Ticket object"
        ticketFactory.getDeskTicket().getClass() == Entry.class
    }

    def "Test ticket factory with an invalid ID"() {

        when: "an invalid number is provided"
        ticketFactory.setTicketId("1");

        then: "a null ticket id should be return"
        !ticketFactory.getDeskTicket().getId()

    }

    def "Test ticket factory with an empty ID"() {

        when: "an empty ticket id is provided"
        ticketFactory.setTicketId();

        then: "a null ticket id should be return"
        !ticketFactory.getDeskTicket().getId()
    }

}

