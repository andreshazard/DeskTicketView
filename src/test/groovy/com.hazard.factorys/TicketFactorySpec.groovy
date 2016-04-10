import com.hazard.factorys.TicketFactory
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Shared
import spock.lang.Subject
import spock.lang.Title

/**
 *
 * Created by andreshazard on 4/9/16.
 */

@Title("Unit testing for the ticket factory considering all ticket ids")
@Subject(TicketFactory)
class TicketFactorySpec extends spock.lang.Specification {

    @Autowired
    @Shared
    TicketFactory ticketFactory;

    def setupSpec() {
        ticketFactory = new TicketFactory();
    }

    def "Test ticket factory with a valid ID"() {

        given:"a valid ticket number"
        def ticket = "16828"

        when: "we pass the ticket number to the factory"
        ticketFactory.setTicketId(ticket);

        then: "a non null ticket object is returned"
        ticketFactory.getDeskTicket()

    }

    def "Test ticket factory with an invalid ID"() {

        given:"an invalid ticket number"
        def ticket = "1"

        when: "we pass the invalid ticket to the factory"
        ticketFactory.setTicketId(ticket);

        then: "a null ticket id should be return"
        !ticketFactory.getDeskTicket().getId()

    }

    def "Test ticket factory with an empty ID"() {

        given:"an empty ticket number"
        def ticket = null

        when: "we pass it to the factory"
        ticketFactory.setTicketId(ticket);

        then: "a null ticket id should be return"
        !ticketFactory.getDeskTicket().getId()
    }

    def cleanup() {
        ticketFactory.setTicketId(null)
    }

}

