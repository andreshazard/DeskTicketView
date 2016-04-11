package com.hazard.company.view

import com.hazard.desk_ticket.DeskTicket
import com.hazard.desk_ticket.Embedded
import com.hazard.desk_ticket.Entry
import com.hazard.factorys.CompanyFactory
import org.springframework.ui.ModelMap
import spock.lang.Subject
import spock.lang.Title
/**
 * Created by andreshazard on 4/10/16.
 */

@Title("tests for CompanyController class")
@Subject(CompanyController)
class CompanyControllerSpec extends spock.lang.Specification {

    def "Models are sent correctly under perfect conditions"() {

        given: "the ideal responses his collaborators (Mocks) "
        CompanyFactory companyFactory = Mock(CompanyFactory)
        DeskTicket deskTicketsObject = Mock(DeskTicket)
        ModelMap model = Mock(ModelMap)
        Embedded embedded = Mock(Embedded)

        and: "necessary helpers"
        String company = "Mirantis"
        List<Entry> entries = new ArrayList<>()
        entries.add(new Entry())

        and: "a company controller using the above objects"
        CompanyController companyController = new
                CompanyController(companyFactory: companyFactory,
                                    deskTicketsObject: deskTicketsObject)

        when: "calling viewCustomerRequest with a random company name"
        companyController.viewCustomerRequest(company, model)

        then: "the method follows the correct flow"
        1 * companyFactory.setCompany(company)
        1 * companyFactory.getDeskTickets() >> deskTicketsObject
        1 * deskTicketsObject.getTotalEntries() >> 1
        1 * deskTicketsObject.getEmbedded() >> embedded
        1 * embedded.getEntries() >> entries

        then: "the model is populated"
        1 * model.put( _ as String, entries )

        then:
        1 * model.put( _ as String, company)

        then:
        1 * model.put( _ as String, 1 )


    }
}


