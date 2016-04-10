package com.hazard.factorys

import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Shared
import spock.lang.Subject
import spock.lang.Title

/**
 * Created by andreshazard on 4/9/16.
 */

@Title("Unit testing for the inputStream factory used by all factories")
@Subject(InputStreamFactory)
class InputStreamFactorySpec extends spock.lang.Specification {

   @Autowired
   @Shared
   InputStreamFactory inputStreamFactory;

    @Shared
    ArrayList<String> credentials;

    def setupSpec() {
        inputStreamFactory = new InputStreamFactory();
    }

    def "Test getCredentials method with file in system"() {

        given: "Correct file is present on project"
        def file = new File("credentials").text
        file

        when: "When we ask for the scanner to read it"
        credentials = inputStreamFactory.getCredentials();

        then: "A list with the credentials is return with no errors thrown"
        credentials.size() == 2;
    }

    def "Test file not in system"() {

        given: "file not in system or wrong name"
        def file = "dummy"

        when: "read file is called from getCredentials"
        def scanner = inputStreamFactory.readFile(file)

        then: "then scanner will be empty and logger will notify"
        !scanner

    }

}
