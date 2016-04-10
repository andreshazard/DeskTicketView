package com.hazard.factorys

import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Shared

/**
 * Created by andreshazard on 4/9/16.
 */

class InputStreamFactorySpec extends spock.lang.Specification {

   @Autowired
   @Shared
   InputStreamFactory inputStreamFactory;

    def setupSpec() {
        inputStreamFactory = new InputStreamFactory();
    }

    def "Test getCredentials method with file in system"() {

        when: "File is present on project"
        ArrayList<String> credentials = inputStreamFactory.getCredentials();

        then: "A list with the credentials is return"
    }

}
