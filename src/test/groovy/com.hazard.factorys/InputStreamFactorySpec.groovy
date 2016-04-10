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

    @Shared
    ArrayList<String> credentials;

    def setupSpec() {
        inputStreamFactory = new InputStreamFactory();
    }

    def "Test getCredentials method with file in system"() {

        when: "File is present on project"
        credentials = inputStreamFactory.getCredentials();

        then: "A list with the credentials is return"
        notThrown(FileNotFoundException)

        and:
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
